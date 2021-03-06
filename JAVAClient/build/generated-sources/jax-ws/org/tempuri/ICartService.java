
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfCartItem;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfFoodItem;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICartService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.foodcartservicelibrary.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface ICartService {


    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfFoodItem
     */
    @WebMethod(operationName = "GetAllFoods", action = "http://tempuri.org/ICartService/GetAllFoods")
    @WebResult(name = "GetAllFoodsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllFoods", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllFoods")
    @ResponseWrapper(localName = "GetAllFoodsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllFoodsResponse")
    public ArrayOfFoodItem getAllFoods();

    /**
     * 
     * @param item
     */
    @WebMethod(operationName = "AddItemToCart", action = "http://tempuri.org/ICartService/AddItemToCart")
    @RequestWrapper(localName = "AddItemToCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddItemToCart")
    @ResponseWrapper(localName = "AddItemToCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddItemToCartResponse")
    public void addItemToCart(
        @WebParam(name = "item", targetNamespace = "http://tempuri.org/")
        CartItem item);

    /**
     * 
     * @param item
     */
    @WebMethod(operationName = "RemoveItemFromCart", action = "http://tempuri.org/ICartService/RemoveItemFromCart")
    @RequestWrapper(localName = "RemoveItemFromCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RemoveItemFromCart")
    @ResponseWrapper(localName = "RemoveItemFromCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RemoveItemFromCartResponse")
    public void removeItemFromCart(
        @WebParam(name = "item", targetNamespace = "http://tempuri.org/")
        CartItem item);

    /**
     * 
     * @param item
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "UpdateCart", action = "http://tempuri.org/ICartService/UpdateCart")
    @WebResult(name = "UpdateCartResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateCart")
    @ResponseWrapper(localName = "UpdateCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.UpdateCartResponse")
    public Integer updateCart(
        @WebParam(name = "item", targetNamespace = "http://tempuri.org/")
        CartItem item);

    /**
     * 
     * @return
     *     returns org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfCartItem
     */
    @WebMethod(operationName = "GetAllItemsFromCart", action = "http://tempuri.org/ICartService/GetAllItemsFromCart")
    @WebResult(name = "GetAllItemsFromCartResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAllItemsFromCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllItemsFromCart")
    @ResponseWrapper(localName = "GetAllItemsFromCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetAllItemsFromCartResponse")
    public ArrayOfCartItem getAllItemsFromCart();

    /**
     * 
     * @param id
     * @return
     *     returns org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem
     */
    @WebMethod(operationName = "GetItemFromCart", action = "http://tempuri.org/ICartService/GetItemFromCart")
    @WebResult(name = "GetItemFromCartResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetItemFromCart", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetItemFromCart")
    @ResponseWrapper(localName = "GetItemFromCartResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetItemFromCartResponse")
    public CartItem getItemFromCart(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param name
     * @return
     *     returns org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfFoodItem
     */
    @WebMethod(operationName = "SearchItemByName", action = "http://tempuri.org/ICartService/SearchItemByName")
    @WebResult(name = "SearchItemByNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SearchItemByName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SearchItemByName")
    @ResponseWrapper(localName = "SearchItemByNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SearchItemByNameResponse")
    public ArrayOfFoodItem searchItemByName(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

}
