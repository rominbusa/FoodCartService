
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.foodcartservicelibrary.CartItem;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItemFromCartResult" type="{http://schemas.datacontract.org/2004/07/FoodCartServiceLibrary}CartItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getItemFromCartResult"
})
@XmlRootElement(name = "GetItemFromCartResponse")
public class GetItemFromCartResponse {

    @XmlElementRef(name = "GetItemFromCartResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CartItem> getItemFromCartResult;

    /**
     * Gets the value of the getItemFromCartResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartItem }{@code >}
     *     
     */
    public JAXBElement<CartItem> getGetItemFromCartResult() {
        return getItemFromCartResult;
    }

    /**
     * Sets the value of the getItemFromCartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartItem }{@code >}
     *     
     */
    public void setGetItemFromCartResult(JAXBElement<CartItem> value) {
        this.getItemFromCartResult = value;
    }

}
