
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    private Links_ links;
    private String type;
    private Components components;
    private Pricing_ pricing;
    private QuoteInfo_ quoteInfo;
    private Integer quantity;
    private String discountGroup;
    private DisabledLinks disabledLinks;
    private CategoryRules categoryRules;
    private String packageId;
    private String marketingOfferId;
    private String itemGroup;
    private String conversationId;
    private String region;
    private List<Object> travelParty = new ArrayList<Object>();
    private String association;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links_ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links_ links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The components
     */
    public Components getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(Components components) {
        this.components = components;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    public Pricing_ getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    public void setPricing(Pricing_ pricing) {
        this.pricing = pricing;
    }

    /**
     * 
     * @return
     *     The quoteInfo
     */
    public QuoteInfo_ getQuoteInfo() {
        return quoteInfo;
    }

    /**
     * 
     * @param quoteInfo
     *     The quoteInfo
     */
    public void setQuoteInfo(QuoteInfo_ quoteInfo) {
        this.quoteInfo = quoteInfo;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The discountGroup
     */
    public String getDiscountGroup() {
        return discountGroup;
    }

    /**
     * 
     * @param discountGroup
     *     The discountGroup
     */
    public void setDiscountGroup(String discountGroup) {
        this.discountGroup = discountGroup;
    }

    /**
     * 
     * @return
     *     The disabledLinks
     */
    public DisabledLinks getDisabledLinks() {
        return disabledLinks;
    }

    /**
     * 
     * @param disabledLinks
     *     The disabledLinks
     */
    public void setDisabledLinks(DisabledLinks disabledLinks) {
        this.disabledLinks = disabledLinks;
    }

    /**
     * 
     * @return
     *     The categoryRules
     */
    public CategoryRules getCategoryRules() {
        return categoryRules;
    }

    /**
     * 
     * @param categoryRules
     *     The categoryRules
     */
    public void setCategoryRules(CategoryRules categoryRules) {
        this.categoryRules = categoryRules;
    }

    /**
     * 
     * @return
     *     The packageId
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * 
     * @param packageId
     *     The packageId
     */
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * 
     * @return
     *     The marketingOfferId
     */
    public String getMarketingOfferId() {
        return marketingOfferId;
    }

    /**
     * 
     * @param marketingOfferId
     *     The marketingOfferId
     */
    public void setMarketingOfferId(String marketingOfferId) {
        this.marketingOfferId = marketingOfferId;
    }

    /**
     * 
     * @return
     *     The itemGroup
     */
    public String getItemGroup() {
        return itemGroup;
    }

    /**
     * 
     * @param itemGroup
     *     The itemGroup
     */
    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    /**
     * 
     * @return
     *     The conversationId
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * 
     * @param conversationId
     *     The conversationId
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * 
     * @return
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The travelParty
     */
    public List<Object> getTravelParty() {
        return travelParty;
    }

    /**
     * 
     * @param travelParty
     *     The travelParty
     */
    public void setTravelParty(List<Object> travelParty) {
        this.travelParty = travelParty;
    }

    /**
     * 
     * @return
     *     The association
     */
    public String getAssociation() {
        return association;
    }

    /**
     * 
     * @param association
     *     The association
     */
    public void setAssociation(String association) {
        this.association = association;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
