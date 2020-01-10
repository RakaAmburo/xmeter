
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cart {

    private Links links;
    private Pricing pricing;
    private QuoteInfo quoteInfo;
    private String cartId;
    private String lastModifiedTime;
    private String createTime;
    private String type;
    private Integer totalNumberOfItems;
    private Boolean loginRequired;
    private List<Item> items = new ArrayList<Item>();
    private UserIdentifier userIdentifier;
    private Boolean guestsUpdated;
    private List<String> holdIneligibleReasons = new ArrayList<String>();
    private Integer maxHoldDays;
    private TermsAndConditions termsAndConditions;
    private Boolean holdEligible;
    private Policies policies;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    /**
     * 
     * @return
     *     The quoteInfo
     */
    public QuoteInfo getQuoteInfo() {
        return quoteInfo;
    }

    /**
     * 
     * @param quoteInfo
     *     The quoteInfo
     */
    public void setQuoteInfo(QuoteInfo quoteInfo) {
        this.quoteInfo = quoteInfo;
    }

    /**
     * 
     * @return
     *     The cartId
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * 
     * @param cartId
     *     The cartId
     */
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * 
     * @return
     *     The lastModifiedTime
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * 
     * @param lastModifiedTime
     *     The lastModifiedTime
     */
    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * 
     * @return
     *     The createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime
     *     The createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
     *     The totalNumberOfItems
     */
    public Integer getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    /**
     * 
     * @param totalNumberOfItems
     *     The totalNumberOfItems
     */
    public void setTotalNumberOfItems(Integer totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    /**
     * 
     * @return
     *     The loginRequired
     */
    public Boolean getLoginRequired() {
        return loginRequired;
    }

    /**
     * 
     * @param loginRequired
     *     The loginRequired
     */
    public void setLoginRequired(Boolean loginRequired) {
        this.loginRequired = loginRequired;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The userIdentifier
     */
    public UserIdentifier getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * 
     * @param userIdentifier
     *     The userIdentifier
     */
    public void setUserIdentifier(UserIdentifier userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    /**
     * 
     * @return
     *     The guestsUpdated
     */
    public Boolean getGuestsUpdated() {
        return guestsUpdated;
    }

    /**
     * 
     * @param guestsUpdated
     *     The guestsUpdated
     */
    public void setGuestsUpdated(Boolean guestsUpdated) {
        this.guestsUpdated = guestsUpdated;
    }

    /**
     * 
     * @return
     *     The holdIneligibleReasons
     */
    public List<String> getHoldIneligibleReasons() {
        return holdIneligibleReasons;
    }

    /**
     * 
     * @param holdIneligibleReasons
     *     The holdIneligibleReasons
     */
    public void setHoldIneligibleReasons(List<String> holdIneligibleReasons) {
        this.holdIneligibleReasons = holdIneligibleReasons;
    }

    /**
     * 
     * @return
     *     The maxHoldDays
     */
    public Integer getMaxHoldDays() {
        return maxHoldDays;
    }

    /**
     * 
     * @param maxHoldDays
     *     The maxHoldDays
     */
    public void setMaxHoldDays(Integer maxHoldDays) {
        this.maxHoldDays = maxHoldDays;
    }

    /**
     * 
     * @return
     *     The termsAndConditions
     */
    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * 
     * @param termsAndConditions
     *     The termsAndConditions
     */
    public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    /**
     * 
     * @return
     *     The holdEligible
     */
    public Boolean getHoldEligible() {
        return holdEligible;
    }

    /**
     * 
     * @param holdEligible
     *     The holdEligible
     */
    public void setHoldEligible(Boolean holdEligible) {
        this.holdEligible = holdEligible;
    }

    /**
     * 
     * @return
     *     The policies
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * 
     * @param policies
     *     The policies
     */
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
