
package org.datacontract.schemas._2004._07.foodcartservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.foodcartservicelibrary package. 
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

    private final static QName _ArrayOfFoodItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "ArrayOfFoodItem");
    private final static QName _FoodItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "FoodItem");
    private final static QName _CartItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "CartItem");
    private final static QName _ArrayOfCartItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "ArrayOfCartItem");
    private final static QName _FoodItemCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "Category");
    private final static QName _FoodItemItemName_QNAME = new QName("http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", "ItemName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.foodcartservicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfFoodItem }
     * 
     */
    public ArrayOfFoodItem createArrayOfFoodItem() {
        return new ArrayOfFoodItem();
    }

    /**
     * Create an instance of {@link CartItem }
     * 
     */
    public CartItem createCartItem() {
        return new CartItem();
    }

    /**
     * Create an instance of {@link ArrayOfCartItem }
     * 
     */
    public ArrayOfCartItem createArrayOfCartItem() {
        return new ArrayOfCartItem();
    }

    /**
     * Create an instance of {@link FoodItem }
     * 
     */
    public FoodItem createFoodItem() {
        return new FoodItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFoodItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "ArrayOfFoodItem")
    public JAXBElement<ArrayOfFoodItem> createArrayOfFoodItem(ArrayOfFoodItem value) {
        return new JAXBElement<ArrayOfFoodItem>(_ArrayOfFoodItem_QNAME, ArrayOfFoodItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoodItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "FoodItem")
    public JAXBElement<FoodItem> createFoodItem(FoodItem value) {
        return new JAXBElement<FoodItem>(_FoodItem_QNAME, FoodItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "CartItem")
    public JAXBElement<CartItem> createCartItem(CartItem value) {
        return new JAXBElement<CartItem>(_CartItem_QNAME, CartItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCartItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "ArrayOfCartItem")
    public JAXBElement<ArrayOfCartItem> createArrayOfCartItem(ArrayOfCartItem value) {
        return new JAXBElement<ArrayOfCartItem>(_ArrayOfCartItem_QNAME, ArrayOfCartItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "Category", scope = FoodItem.class)
    public JAXBElement<String> createFoodItemCategory(String value) {
        return new JAXBElement<String>(_FoodItemCategory_QNAME, String.class, FoodItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "ItemName", scope = FoodItem.class)
    public JAXBElement<String> createFoodItemItemName(String value) {
        return new JAXBElement<String>(_FoodItemItemName_QNAME, String.class, FoodItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "Category", scope = CartItem.class)
    public JAXBElement<String> createCartItemCategory(String value) {
        return new JAXBElement<String>(_FoodItemCategory_QNAME, String.class, CartItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary", name = "ItemName", scope = CartItem.class)
    public JAXBElement<String> createCartItemItemName(String value) {
        return new JAXBElement<String>(_FoodItemItemName_QNAME, String.class, CartItem.class, value);
    }

}
