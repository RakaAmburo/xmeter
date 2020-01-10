
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Links {

    private RemoveCart removeCart;
    private AddDiningItem addDiningItem;
    private GetItems getItems;
    private CompareVacationOffers compareVacationOffers;
    private UpdateCart updateCart;
    private RemoveItems removeItems;
    private Self self;
    private AddItem addItem;
    private CreateOrder createOrder;
    private AddItems addItems;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The removeCart
     */
    public RemoveCart getRemoveCart() {
        return removeCart;
    }

    /**
     * 
     * @param removeCart
     *     The removeCart
     */
    public void setRemoveCart(RemoveCart removeCart) {
        this.removeCart = removeCart;
    }

    /**
     * 
     * @return
     *     The addDiningItem
     */
    public AddDiningItem getAddDiningItem() {
        return addDiningItem;
    }

    /**
     * 
     * @param addDiningItem
     *     The addDiningItem
     */
    public void setAddDiningItem(AddDiningItem addDiningItem) {
        this.addDiningItem = addDiningItem;
    }

    /**
     * 
     * @return
     *     The getItems
     */
    public GetItems getGetItems() {
        return getItems;
    }

    /**
     * 
     * @param getItems
     *     The getItems
     */
    public void setGetItems(GetItems getItems) {
        this.getItems = getItems;
    }

    /**
     * 
     * @return
     *     The compareVacationOffers
     */
    public CompareVacationOffers getCompareVacationOffers() {
        return compareVacationOffers;
    }

    /**
     * 
     * @param compareVacationOffers
     *     The compareVacationOffers
     */
    public void setCompareVacationOffers(CompareVacationOffers compareVacationOffers) {
        this.compareVacationOffers = compareVacationOffers;
    }

    /**
     * 
     * @return
     *     The updateCart
     */
    public UpdateCart getUpdateCart() {
        return updateCart;
    }

    /**
     * 
     * @param updateCart
     *     The updateCart
     */
    public void setUpdateCart(UpdateCart updateCart) {
        this.updateCart = updateCart;
    }

    /**
     * 
     * @return
     *     The removeItems
     */
    public RemoveItems getRemoveItems() {
        return removeItems;
    }

    /**
     * 
     * @param removeItems
     *     The removeItems
     */
    public void setRemoveItems(RemoveItems removeItems) {
        this.removeItems = removeItems;
    }

    /**
     * 
     * @return
     *     The self
     */
    public Self getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(Self self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The addItem
     */
    public AddItem getAddItem() {
        return addItem;
    }

    /**
     * 
     * @param addItem
     *     The addItem
     */
    public void setAddItem(AddItem addItem) {
        this.addItem = addItem;
    }

    /**
     * 
     * @return
     *     The createOrder
     */
    public CreateOrder getCreateOrder() {
        return createOrder;
    }

    /**
     * 
     * @param createOrder
     *     The createOrder
     */
    public void setCreateOrder(CreateOrder createOrder) {
        this.createOrder = createOrder;
    }

    /**
     * 
     * @return
     *     The addItems
     */
    public AddItems getAddItems() {
        return addItems;
    }

    /**
     * 
     * @param addItems
     *     The addItems
     */
    public void setAddItems(AddItems addItems) {
        this.addItems = addItems;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
