
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfCartItem;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.ArrayOfFoodItem;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllFoodsResponseGetAllFoodsResult_QNAME = new QName("http://tempuri.org/", "GetAllFoodsResult");
    private final static QName _AddItemToCartItem_QNAME = new QName("http://tempuri.org/", "item");
    private final static QName _GetAllItemsFromCartResponseGetAllItemsFromCartResult_QNAME = new QName("http://tempuri.org/", "GetAllItemsFromCartResult");
    private final static QName _GetItemFromCartResponseGetItemFromCartResult_QNAME = new QName("http://tempuri.org/", "GetItemFromCartResult");
    private final static QName _SearchItemByNameName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _SearchItemByNameResponseSearchItemByNameResult_QNAME = new QName("http://tempuri.org/", "SearchItemByNameResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllFoods }
     * 
     */
    public GetAllFoods createGetAllFoods() {
        return new GetAllFoods();
    }

    /**
     * Create an instance of {@link GetAllFoodsResponse }
     * 
     */
    public GetAllFoodsResponse createGetAllFoodsResponse() {
        return new GetAllFoodsResponse();
    }

    /**
     * Create an instance of {@link AddItemToCart }
     * 
     */
    public AddItemToCart createAddItemToCart() {
        return new AddItemToCart();
    }

    /**
     * Create an instance of {@link AddItemToCartResponse }
     * 
     */
    public AddItemToCartResponse createAddItemToCartResponse() {
        return new AddItemToCartResponse();
    }

    /**
     * Create an instance of {@link RemoveItemFromCart }
     * 
     */
    public RemoveItemFromCart createRemoveItemFromCart() {
        return new RemoveItemFromCart();
    }

    /**
     * Create an instance of {@link RemoveItemFromCartResponse }
     * 
     */
    public RemoveItemFromCartResponse createRemoveItemFromCartResponse() {
        return new RemoveItemFromCartResponse();
    }

    /**
     * Create an instance of {@link UpdateCart }
     * 
     */
    public UpdateCart createUpdateCart() {
        return new UpdateCart();
    }

    /**
     * Create an instance of {@link UpdateCartResponse }
     * 
     */
    public UpdateCartResponse createUpdateCartResponse() {
        return new UpdateCartResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsFromCart }
     * 
     */
    public GetAllItemsFromCart createGetAllItemsFromCart() {
        return new GetAllItemsFromCart();
    }

    /**
     * Create an instance of {@link GetAllItemsFromCartResponse }
     * 
     */
    public GetAllItemsFromCartResponse createGetAllItemsFromCartResponse() {
        return new GetAllItemsFromCartResponse();
    }

    /**
     * Create an instance of {@link GetItemFromCart }
     * 
     */
    public GetItemFromCart createGetItemFromCart() {
        return new GetItemFromCart();
    }

    /**
     * Create an instance of {@link GetItemFromCartResponse }
     * 
     */
    public GetItemFromCartResponse createGetItemFromCartResponse() {
        return new GetItemFromCartResponse();
    }

    /**
     * Create an instance of {@link SearchItemByName }
     * 
     */
    public SearchItemByName createSearchItemByName() {
        return new SearchItemByName();
    }

    /**
     * Create an instance of {@link SearchItemByNameResponse }
     * 
     */
    public SearchItemByNameResponse createSearchItemByNameResponse() {
        return new SearchItemByNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFoodItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllFoodsResult", scope = GetAllFoodsResponse.class)
    public JAXBElement<ArrayOfFoodItem> createGetAllFoodsResponseGetAllFoodsResult(ArrayOfFoodItem value) {
        return new JAXBElement<ArrayOfFoodItem>(_GetAllFoodsResponseGetAllFoodsResult_QNAME, ArrayOfFoodItem.class, GetAllFoodsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "item", scope = AddItemToCart.class)
    public JAXBElement<CartItem> createAddItemToCartItem(CartItem value) {
        return new JAXBElement<CartItem>(_AddItemToCartItem_QNAME, CartItem.class, AddItemToCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "item", scope = RemoveItemFromCart.class)
    public JAXBElement<CartItem> createRemoveItemFromCartItem(CartItem value) {
        return new JAXBElement<CartItem>(_AddItemToCartItem_QNAME, CartItem.class, RemoveItemFromCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "item", scope = UpdateCart.class)
    public JAXBElement<CartItem> createUpdateCartItem(CartItem value) {
        return new JAXBElement<CartItem>(_AddItemToCartItem_QNAME, CartItem.class, UpdateCart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllItemsFromCartResult", scope = GetAllItemsFromCartResponse.class)
    public JAXBElement<ArrayOfCartItem> createGetAllItemsFromCartResponseGetAllItemsFromCartResult(ArrayOfCartItem value) {
        return new JAXBElement<ArrayOfCartItem>(_GetAllItemsFromCartResponseGetAllItemsFromCartResult_QNAME, ArrayOfCartItem.class, GetAllItemsFromCartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetItemFromCartResult", scope = GetItemFromCartResponse.class)
    public JAXBElement<CartItem> createGetItemFromCartResponseGetItemFromCartResult(CartItem value) {
        return new JAXBElement<CartItem>(_GetItemFromCartResponseGetItemFromCartResult_QNAME, CartItem.class, GetItemFromCartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = SearchItemByName.class)
    public JAXBElement<String> createSearchItemByNameName(String value) {
        return new JAXBElement<String>(_SearchItemByNameName_QNAME, String.class, SearchItemByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFoodItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchItemByNameResult", scope = SearchItemByNameResponse.class)
    public JAXBElement<ArrayOfFoodItem> createSearchItemByNameResponseSearchItemByNameResult(ArrayOfFoodItem value) {
        return new JAXBElement<ArrayOfFoodItem>(_SearchItemByNameResponseSearchItemByNameResult_QNAME, ArrayOfFoodItem.class, SearchItemByNameResponse.class, value);
    }

}
