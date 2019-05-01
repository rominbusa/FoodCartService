<%-- 
    Document   : ItemList
    Created on : 6 Apr, 2019, 9:15:46 PM
    Author     : Dell-pc
--%>

<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.ObjectFactory"%>
<%@page import="javax.xml.namespace.QName"%>

<%@page import="javax.xml.bind.JAXBElement"%>
<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem"%>
<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfCartItem"%>
<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfFoodItem"%>
<%@page import="org.datacontract.schemas._2004._07.foodcartservicelibrary.FoodItem"%>
<%@page import="org.tempuri.ICartService"%>
<%@page import="org.tempuri.CartService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item List</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            .table td, th{
                text-align: center;
            }
        </style>
    </head>
    <body>
        
        <div class='container-fluid'>
        <h1 style="text-align: center;">Item List</h1>
        <br/>
        <a href='Cart.jsp'><h3>View Cart</h3></a>
        <br/>
        
        <form style="width:300px" action="ItemList.jsp">
            <div class="input-group">
                <input type="text" name="search" class="form-control" placeholder="Search By Item Name">
                <div class="input-group-btn">
                <button class="btn btn-default" type="submit">
                    <i class="glyphicon glyphicon-search"></i>
                </button>
                </div>
            </div>
        </form>
        <br/>
 
        <% 
            CartService service=new CartService();
            ICartService client=service.getBasicHttpBindingICartService();
            ArrayOfFoodItem as=client.getAllFoods();
        %>
        <%
            String search=request.getParameter("search");
            if(search != null){
                ArrayOfFoodItem searchItems=client.searchItemByName(search);
                if(searchItems!=null){%>
        <%="<div class='table-responsive'><table class='table table-striped table-bordered' border='1'><tr align='center'><th width='30px'>ItemId</th><th>ItemName</th><th>Category</th>"
                + "<th>Price</th></tr>"
        %>   
        <%
            for(FoodItem fi:searchItems.getFoodItem()){
        %>
        <%="<tr><td>" + fi.getItemId()+"</td>"
                + "<td>"+fi.getItemName().getValue()+"</td>"
                + "<td>"+fi.getCategory().getValue()+"</td>"
                + "<td>"+fi.getPrice()+"</td>"
                + "<td><form action='ItemList.jsp' method='get'>"
                + "<input type='hidden' name='addtocart' value='"+fi.getItemId()+"'>"
                + "<button type='submit' class='btn btn-default btn-sm'>"
                + "<span class='glyphicon glyphicon-plus-sign'></span>"
                + "</button></form></td>"
                + "</tr>"
        
        %>
                
        <%
            }
        %>
        <%="</table></div>"%>
        <%
                    
                }
            }
        %>
        <% 
            //Implementation Of Add Item To Cart Button
            String id=request.getParameter("addtocart");
            ArrayOfCartItem cs=client.getAllItemsFromCart();    
            int flag=1;
            if(id != null){
                for(CartItem c:cs.getCartItem()){        
                    if(c.getItemId().toString().equals(id)){
                        c.setQuantity(c.getQuantity()+1);
                        c.setTotalPrice(c.getTotalPrice()+c.getPrice());
                        client.updateCart(c);
                        flag=0;
                    }
                }
            }
            if(flag == 1 && id != null){
                //CartItem c = client.getItemFromCart(Integer.valueOf(id));     
                for(FoodItem f:as.getFoodItem()){
                    if(f.getItemId().toString().equals(id)){
                        CartItem c1=new CartItem();
                        c1.setItemId(f.getItemId());
                        c1.setItemName(f.getItemName());
                        c1.setCategory(f.getCategory());
                        c1.setQuantity(1);
                        c1.setPrice(f.getPrice());
                        c1.setTotalPrice(f.getPrice());
                        client.addItemToCart(c1);
                    }
                }
            }
        %>
        <% if(search == null){%>
        <%="<div class='table-responsive'><table class='table table-striped table-bordered' border='1'><tr align='center'><th width='30px'>ItemId</th><th>ItemName</th><th>Category</th>"
                + "<th>Price</th></tr>"
        %>
       
        <%
            for(FoodItem i:as.getFoodItem())
        {%>
            
        <%="<tr><td>" + i.getItemId()+"</td>"
                + "<td>"+i.getItemName().getValue()+"</td>"
                + "<td>"+i.getCategory().getValue()+"</td>"
                + "<td>"+i.getPrice()+"</td>"
                + "<td><form action='ItemList.jsp' method='get'>"
                + "<input type='hidden' name='addtocart' value='"+i.getItemId()+"'>"
                + "<button type='submit' class='btn btn-default btn-sm'>"
                + "<span class='glyphicon glyphicon-plus-sign'></span>"
                + "</button></form></td>"
                + "</tr>"
        %>
        <% } %>
        <%="</table></div>"%>
        <% } %>
        <%="</div>"%>
    </body>
</html>
