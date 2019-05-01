using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace FoodCartClientWebApp
{
    public partial class ItemList : System.Web.UI.Page
    {
        FoodCartClientWebApp.ServiceReference1.CartServiceClient proxy;
        protected void Page_Load(object sender, EventArgs e)
        {
            
            if(TextBox1.Text.ToString().Equals("")) {
                GridView1.DataSource = SqlDataSource1;
            }
            else
            {
                GridView1.DataSource = SqlDataSource2;
            }
            GridView1.DataBind();

        }
        
        protected void GridView1_SelectedIndexChanged1(object sender, EventArgs e)
        {
            proxy = new ServiceReference1.CartServiceClient();
            FoodCartClientWebApp.ServiceReference1.CartItem item = new ServiceReference1.CartItem();
            int idx = GridView1.SelectedIndex;
            GridViewRow row = GridView1.Rows[idx];
            item.ItemId = int.Parse(row.Cells[0].Text);

            item.ItemName = row.Cells[1].Text;
            item.Category = row.Cells[2].Text;
            item.Price = int.Parse(row.Cells[3].Text);
            ServiceReference1.CartItem x = proxy.GetItemFromCart(item.ItemId);

            if (x == null)
            {
                item.Quantity = 1;
                item.TotalPrice = (item.Quantity) * (item.Price);
                proxy.AddItemToCart(item);
            }
            else
            {
                int qua = 0;

                qua = int.Parse(x.Quantity.ToString());

                item.Quantity = qua + 1;
                item.TotalPrice = (qua + 1) * item.Price;
                proxy.UpdateCart(item);
            }

        }
        //Search Button 
        protected void Button1_Click(object sender, EventArgs e)
        {
            proxy = new ServiceReference1.CartServiceClient();
            string name = TextBox1.Text;
            List<ServiceReference1.FoodItem> items = proxy.SearchItemByName(name).ToList();
            if(name != null)
            {
                GridView1.DataSource = SqlDataSource2;
                GridView1.DataBind();
            }
        }
    }
}