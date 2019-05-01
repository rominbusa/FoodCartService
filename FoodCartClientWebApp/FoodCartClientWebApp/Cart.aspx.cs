using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace FoodCartClientWebApp
{
    public partial class Cart : System.Web.UI.Page
    {
        ServiceReference1.CartServiceClient client;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!Page.IsPostBack)
            {
                int tp = 0;
                client = new ServiceReference1.CartServiceClient();
                List<ServiceReference1.CartItem> items = client.GetAllItemsFromCart().ToList();
                foreach (var x in items)
                {
                    tp += int.Parse(x.TotalPrice.ToString());
                }
                Label1.Text = tp.ToString();
            }
        }

        protected void GridView1_RowCommand(object sender, GridViewCommandEventArgs e)
        {
            client = new ServiceReference1.CartServiceClient();
            ServiceReference1.CartItem item = new ServiceReference1.CartItem();
            int id = Int32.Parse(e.CommandArgument.ToString());
            item.ItemId = id;
            int qua = 0, total_price = 0, price = 0;

            ServiceReference1.CartItem ds = client.GetItemFromCart(id);

            qua = int.Parse(ds.Quantity.ToString());
            total_price = int.Parse(ds.TotalPrice.ToString());
            price = int.Parse(ds.Price.ToString());
            if (e.CommandName == "RemoveAll")
            {
                client.RemoveItemFromCart(item);
                GridView1.DataBind();
            }
            if (e.CommandName == "Add")
            {
                item.Quantity = qua + 1;
                item.TotalPrice = total_price + price;
                client.UpdateCart(item);
                GridView1.DataBind();
            }
            if (e.CommandName == "Remove")
            {
                if (qua > 1)
                {
                    item.Quantity = qua - 1;
                    item.TotalPrice = total_price - price;
                    client.UpdateCart(item);
                    GridView1.DataBind();
                }
                else
                {
                    client.RemoveItemFromCart(item);
                    GridView1.DataBind();
                }

            }
            List<ServiceReference1.CartItem> items = client.GetAllItemsFromCart().ToList();
            int amount = 0;
            foreach (var x in items)
            {
                amount += int.Parse(x.TotalPrice.ToString());
            }
            Label1.Text = amount.ToString();
        }
    }
}