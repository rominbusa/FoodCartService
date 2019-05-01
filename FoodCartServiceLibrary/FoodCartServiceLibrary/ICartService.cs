using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace FoodCartServiceLibrary
{
    [ServiceContract]
    public interface ICartService
    {
        [OperationContract]
        List<FoodItem> GetAllFoods();
        [OperationContract]
        void AddItemToCart(CartItem item);
        [OperationContract]
        void RemoveItemFromCart(CartItem item);
        [OperationContract]
        int UpdateCart(CartItem item);
        [OperationContract]
        List<CartItem> GetAllItemsFromCart();
        [OperationContract]
        CartItem GetItemFromCart(int id);
        [OperationContract]
        List<FoodItem> SearchItemByName(String name);
    }
    
}
