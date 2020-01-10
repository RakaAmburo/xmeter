
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Links_ {

    private Update update;
    private DiscountGroup discountGroup;
    private GetTicketsForm getTicketsForm;
    private Remove remove;
    private GetDMEForm getDMEForm;
    private MarketingOffer marketingOffer;
    private GetFlightForm getFlightForm;
    private Package _package;
    private Cart_ cart;
    private Self_ self;
    private GetDiningForm getDiningForm;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The update
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * 
     * @param update
     *     The update
     */
    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * 
     * @return
     *     The discountGroup
     */
    public DiscountGroup getDiscountGroup() {
        return discountGroup;
    }

    /**
     * 
     * @param discountGroup
     *     The discountGroup
     */
    public void setDiscountGroup(DiscountGroup discountGroup) {
        this.discountGroup = discountGroup;
    }

    /**
     * 
     * @return
     *     The getTicketsForm
     */
    public GetTicketsForm getGetTicketsForm() {
        return getTicketsForm;
    }

    /**
     * 
     * @param getTicketsForm
     *     The getTicketsForm
     */
    public void setGetTicketsForm(GetTicketsForm getTicketsForm) {
        this.getTicketsForm = getTicketsForm;
    }

    /**
     * 
     * @return
     *     The remove
     */
    public Remove getRemove() {
        return remove;
    }

    /**
     * 
     * @param remove
     *     The remove
     */
    public void setRemove(Remove remove) {
        this.remove = remove;
    }

    /**
     * 
     * @return
     *     The getDMEForm
     */
    public GetDMEForm getGetDMEForm() {
        return getDMEForm;
    }

    /**
     * 
     * @param getDMEForm
     *     The getDMEForm
     */
    public void setGetDMEForm(GetDMEForm getDMEForm) {
        this.getDMEForm = getDMEForm;
    }

    /**
     * 
     * @return
     *     The marketingOffer
     */
    public MarketingOffer getMarketingOffer() {
        return marketingOffer;
    }

    /**
     * 
     * @param marketingOffer
     *     The marketingOffer
     */
    public void setMarketingOffer(MarketingOffer marketingOffer) {
        this.marketingOffer = marketingOffer;
    }

    /**
     * 
     * @return
     *     The getFlightForm
     */
    public GetFlightForm getGetFlightForm() {
        return getFlightForm;
    }

    /**
     * 
     * @param getFlightForm
     *     The getFlightForm
     */
    public void setGetFlightForm(GetFlightForm getFlightForm) {
        this.getFlightForm = getFlightForm;
    }

    /**
     * 
     * @return
     *     The _package
     */
    public Package getPackage() {
        return _package;
    }

    /**
     * 
     * @param _package
     *     The package
     */
    public void setPackage(Package _package) {
        this._package = _package;
    }

    /**
     * 
     * @return
     *     The cart
     */
    public Cart_ getCart() {
        return cart;
    }

    /**
     * 
     * @param cart
     *     The cart
     */
    public void setCart(Cart_ cart) {
        this.cart = cart;
    }

    /**
     * 
     * @return
     *     The self
     */
    public Self_ getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(Self_ self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The getDiningForm
     */
    public GetDiningForm getGetDiningForm() {
        return getDiningForm;
    }

    /**
     * 
     * @param getDiningForm
     *     The getDiningForm
     */
    public void setGetDiningForm(GetDiningForm getDiningForm) {
        this.getDiningForm = getDiningForm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
