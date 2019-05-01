using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace FoodCartServiceLibrary
{
    public class CartService : ICartService
    {
        public void AddItemToCart(CartItem c)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("INSERT INTO Cart(ItemId,itemname,category,price,quantity,totalprice) " +
                "VALUES(@itemid,@itemname,@category,@price,@quantity,@totalprice)", con);
            cmd.Parameters.AddWithValue("@itemid", c.ItemId);
            cmd.Parameters.AddWithValue("@itemname", c.ItemName);
            cmd.Parameters.AddWithValue("@category", c.Category);
            cmd.Parameters.AddWithValue("@price", c.Price);
            cmd.Parameters.AddWithValue("@quantity", c.Quantity);
            cmd.Parameters.AddWithValue("@totalprice", c.TotalPrice);
            cmd.ExecuteNonQuery();
            con.Close();
        }

        public List<FoodItem> GetAllFoods()
        {
            List<FoodItem> items = new List<FoodItem>();
            SqlConnection cn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");

            cn.Open();
            SqlCommand cmd = new SqlCommand("SELECT ItemId,itemname,category,price FROM FoodItem", cn);
            SqlDataReader rdr = cmd.ExecuteReader();
            while (rdr.Read())
            {
                FoodItem f = new FoodItem();
                f.ItemId = (int)rdr["ItemId"];
                f.ItemName = (string)rdr["itemname"];
                //f.Image = (string)rdr["image"];
                f.Category = (string)rdr["category"];
                f.Price = (int)rdr["price"];
                items.Add(f);
            }
            return items;
        }

        public List<CartItem> GetAllItemsFromCart()
        {
            List<CartItem> items = new List<CartItem>();
            SqlConnection cn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");

            cn.Open();
            SqlCommand cmd = new SqlCommand("SELECT ItemId,itemname,category,price,quantity,totalprice FROM Cart", cn);
            SqlDataReader rdr = cmd.ExecuteReader();
            while (rdr.Read())
            {
                CartItem f = new CartItem();
                f.ItemId = (int)rdr["ItemId"];
                f.ItemName = (string)rdr["itemname"];
                f.Category = (string)rdr["category"];
                f.Price = (int)rdr["price"];
                f.Quantity = (int)rdr["quantity"];
                f.TotalPrice = (int)rdr["totalprice"];
                items.Add(f);
            }
            return items;
        }

        public CartItem GetItemFromCart(int id)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("SELECT * FROM Cart WHERE ItemId=@itemid", con);
            cmd.Parameters.AddWithValue("@itemid", id);
            SqlDataReader rdr = cmd.ExecuteReader();

            if (rdr.Read())
            {
                CartItem f = new CartItem();
                f.ItemId = (int)rdr["ItemID"];
                f.ItemName = (string)rdr["itemname"];
                f.Category = (string)rdr["category"];
                f.Price = (int)rdr["price"];
                f.Quantity = (int)rdr["quantity"];
                f.TotalPrice = (int)rdr["totalprice"];
                return f;
            }
            return null;

        }

        public void RemoveItemFromCart(CartItem item)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("DELETE from Cart where ItemId=@itemid", con);
            cmd.Parameters.AddWithValue("@itemid", item.ItemId);
            cmd.ExecuteNonQuery();
            con.Close();
        }

        public List<FoodItem> SearchItemByName(string name)
        {
            List<FoodItem> fooditems = new List<FoodItem>();
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("SELECT * FROM FoodItem WHERE itemname=@itemname", con);
            cmd.Parameters.AddWithValue("@itemname", name);
            SqlDataReader rdr = cmd.ExecuteReader();
            while (rdr.Read())
            {
                FoodItem item = new FoodItem();
                item.ItemId = (int)rdr["ItemId"];
                item.ItemName = (string)rdr["itemname"];
                item.Category = (string)rdr["category"];
                item.Price = (int)rdr["price"];
                fooditems.Add(item);
            }

            if (fooditems.Count == 0) { return null; }
            return fooditems;
        }

        public int UpdateCart(CartItem item)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=CartDB;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("UPDATE Cart SET quantity=@quantity,totalprice=@totalprice where ItemId=@itemid", con);
            cmd.Parameters.AddWithValue("@itemid", item.ItemId);
            cmd.Parameters.AddWithValue("@quantity", item.Quantity);
            cmd.Parameters.AddWithValue("@totalprice", item.TotalPrice);
            int res = cmd.ExecuteNonQuery();

            con.Close();
            return res;
        }
        
    }
}
