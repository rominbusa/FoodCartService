<%-- 
    Document   : additem
    Created on : 6 Apr, 2019, 7:00:27 PM
    Author     : Dell-pc
--%>

<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfCartItem"%>
<%@page import="javax.xml.bind.JAXBElement"%>
<%@page import="org.tempuri.ObjectFactory"%>
<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem"%>
<%@page import="org.tempuri.ICartService"%>
<%@page import="org.tempuri.CartService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cart</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>.table td, th{
                text-align: center; 
   
        }
        #label1{
            font-size: 20px;
        }
        </style>
    </head>
    <body>
                <div class='container-fluid'>

                    <h1 style="text-align: center;">Cart</h1>
                    <br />
        <a href='ItemList.jsp'><h3>View Item List</h3></a>
        <% 
            CartService service=new CartService();
            ICartService client=service.getBasicHttpBindingICartService();
            //ArrayOfCartItem as=client.getAllItemsFromCart();
            ArrayOfCartItem aci;
        %>
        <%
            //Implementation of Add Quantity
            String id=request.getParameter("add");
            if(id != null){
                CartItem c=client.getItemFromCart(Integer.valueOf(id));
                if(c != null){
                    c.setQuantity(c.getQuantity()+1);
                    c.setTotalPrice(c.getTotalPrice()+c.getPrice());
                    client.updateCart(c);   
                }                
            }
            aci=client.getAllItemsFromCart();
        %>
        <%
            ////Implementation of Remove Quantity
            String id1=request.getParameter("remove");
            if(id1 != null){
                CartItem c=client.getItemFromCart(Integer.valueOf(id1));
                if(c != null){
                    if(c.getQuantity() > 1){
                        c.setQuantity(c.getQuantity()-1);
                        c.setTotalPrice(c.getTotalPrice()-c.getPrice());
                        client.updateCart(c);
                    }
                    else{
                        client.removeItemFromCart(c);
                    }
                    
                }
            }
            aci=client.getAllItemsFromCart();
        %>
        <%
            //Implementation of RemoveAll Quantity
            String id2=request.getParameter("removeall");
            if(id2 != null){
                CartItem c=client.getItemFromCart(Integer.valueOf(id2));
                if(c != null){
                        client.removeItemFromCart(c);
                }
            }
            aci=client.getAllItemsFromCart();
        %>
        <%="<div class='table-responsive'><table class='table table-striped table-bordered' border='1'><tr align='center'><th>ItemId</th><th>ItemName</th><th>Category</th><th>Quantity</th>"
                + "<th>Price</th><th>TotalPrice</th></tr>"
            
        %>
        <%
            for(CartItem i:aci.getCartItem())
        {%>
            
        <%="<tr><td>" + i.getItemId()+"</td>"
                + "<td>"+i.getItemName().getValue()+"</td>"
                + "<td>"+i.getCategory().getValue()+"</td>"
                + "<td>"+i.getQuantity()+"</td>"
                + "<td>"+i.getPrice()+"</td>"
                + "<td>"+i.getTotalPrice()+"</td>"
                + "<td><form action='Cart.jsp' method='get'>"
                + "<input type='hidden' name='add' value='"+i.getItemId()+"'>"
                + "<button type='submit' class='btn btn-default btn-sm'>"
                + "<span class='glyphicon glyphicon-plus'></span>"
                + "</button>"
                + "</form></td>"
                
                + "<td><form action='Cart.jsp' method='get'>"
                + "<input type='hidden' name='remove' value='"+i.getItemId()+"'>"
                + "<button type='submit' class='btn btn-default btn-sm'>"
                + "<span class='glyphicon glyphicon-minus'></span>"
                + "</button>"
                + "</form></td>"
                + "<td><form action='Cart.jsp' method='get'>"
                + "<input type='hidden' name='removeall' value='"+i.getItemId()+"'>"
                + "<input type='submit' class='btn btn-danger' value='RemoveAll'/></form></td></tr>"%>
                
        
        <% } %>
        <%="</table></div>"%>
        <%
            ArrayOfCartItem cartitems=client.getAllItemsFromCart();
            int TotalAmount=0;
            for(CartItem item:cartitems.getCartItem()){
                TotalAmount+=item.getTotalPrice();
            }
        %>        
        <%=
            "<br /><label id='label1'>Total Amount : "+TotalAmount+"</label>"
        %>
        </div>
    </body>
</html>
