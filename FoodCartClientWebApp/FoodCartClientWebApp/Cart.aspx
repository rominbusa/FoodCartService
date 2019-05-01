<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Cart.aspx.cs" Inherits="FoodCartClientWebApp.Cart" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        #GridView1{
            margin-left:auto;
            margin-right:auto;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div style="text-align:center;">
            <br />
            <asp:Label ID="Label2" runat="server" Font-Bold="True" Font-Size="XX-Large" Font-Strikeout="False" Text="CART" ForeColor="#3366FF"></asp:Label>
            <br />
            <br />
            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="~/ItemList.aspx">Add New Item</asp:HyperLink>
            <br />
            <br />

            <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" OnRowCommand="GridView1_RowCommand" CellPadding="4" DataKeyNames="ItemId" DataSourceID="SqlDataSource1" ForeColor="#333333" GridLines="None">
                <AlternatingRowStyle BackColor="White" />
                <Columns>
                    <asp:BoundField DataField="ItemId" HeaderText="ItemId" ReadOnly="True" SortExpression="ItemId">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"></ItemStyle>
                    </asp:BoundField>
                    <asp:BoundField DataField="itemname" HeaderText="ItemName" SortExpression="itemname">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"></ItemStyle>
                    </asp:BoundField>
                    <asp:BoundField DataField="category" HeaderText="Category" SortExpression="category">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"></ItemStyle>
                    </asp:BoundField>
                    <asp:BoundField DataField="price" HeaderText="Price" SortExpression="price">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"></ItemStyle>
                    </asp:BoundField>
                    <asp:TemplateField HeaderText="Quantity" HeaderStyle-HorizontalAlign="Center" ItemStyle-HorizontalAlign="Center">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"/>
                        <ItemTemplate>
                            <asp:ImageButton ImageUrl="~/images/icons8-plus-50.png" CommandArgument='<%#Eval("ItemId") %>' runat="server" CommandName="Add" Width="15px" Height="15px" />
                            <asp:Label ID="qua" runat="server" Text='<%# Eval("quantity") %>'></asp:Label>
                            <asp:ImageButton ImageUrl="~/images/icons8-minus-50.png" CommandArgument='<%#Eval("ItemId") %>' runat="server" CommandName="Remove" Width="15px" Height="15px" />
                        </ItemTemplate>
                    </asp:TemplateField>
                    <%--<asp:BoundField DataField="quantity" HeaderText="Quantity" SortExpression="quantity"/>--%>
                    <asp:BoundField DataField="totalprice" HeaderText="TotalPrice" SortExpression="totalprice">
                        <HeaderStyle HorizontalAlign="Center"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Center"></ItemStyle>
                    </asp:BoundField>
                    <asp:TemplateField>
                        <ItemTemplate>
                            <asp:Button CommandName="RemoveAll" CommandArgument='<%#Eval("ItemId") %>' Text="RemoveAll" runat="server" />
                        </ItemTemplate>
                    </asp:TemplateField>
                </Columns>
                <FooterStyle BackColor="#990000" Font-Bold="True" ForeColor="White" />
                <HeaderStyle BackColor="#990000" Font-Bold="True" ForeColor="White" />
                <PagerStyle BackColor="#FFCC66" ForeColor="#333333" HorizontalAlign="Center" />
                <RowStyle BackColor="#FFFBD6" ForeColor="#333333" />
                <SelectedRowStyle BackColor="#FFCC66" Font-Bold="True" ForeColor="Navy" />
                <SortedAscendingCellStyle BackColor="#FDF5AC" />
                <SortedAscendingHeaderStyle BackColor="#4D0000" />
                <SortedDescendingCellStyle BackColor="#FCF6C0" />
                <SortedDescendingHeaderStyle BackColor="#820000" />
            </asp:GridView>
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:CartDBConnectionString %>" SelectCommand="SELECT * FROM [Cart]" UpdateCommand="UPDATE [Cart] SET [quantity]=@quantity WHERE [ItemID]=@ItemID">
                    <UpdateParameters>
                    <asp:Parameter Name="quantity" Type="Int32"/>
                    <asp:Parameter Name="ItemID" Type="Int32" />
                </UpdateParameters>
            </asp:SqlDataSource>
            <br />
            <div style="font-size:x-large">Total Amount : <asp:Label ID="Label1" Font-Size="X-Large" runat="server" Text="Label"></asp:Label></div>
            <br />
            <br />

        </div>
    </form>
</body>
</html>
