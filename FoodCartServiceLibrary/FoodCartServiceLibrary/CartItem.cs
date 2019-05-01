using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace FoodCartServiceLibrary
{
    [DataContract]
    public class CartItem
    {
        [DataMember]
        public int ItemId { get; set; }
        [DataMember]
        public string ItemName { get; set; }
        [DataMember]
        public string Category { get; set; }
        [DataMember]
        public int Price { get; set; }
        [DataMember]
        public int Quantity { get; set; }
        [DataMember]
        public int TotalPrice { get; set; }
    }
}
