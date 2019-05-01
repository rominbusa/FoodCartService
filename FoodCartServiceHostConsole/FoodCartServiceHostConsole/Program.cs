using FoodCartServiceLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace FoodCartServiceHostConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(CartService);
            Uri http = new Uri("http://localhost:8015/CartService");
            ServiceHost host = new ServiceHost(t, http);
            host.Open();
            Console.WriteLine("PUBLISHED");
            Console.ReadLine();
            host.Close();
        }
    }
}
