
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Room {

    private Links__ links;
    private ReservationDates reservationDates;
    private PartyMix partyMix;
    private UnitPrice unitPrice;
    private NightlyPrices nightlyPrices;
    private Boolean prioritizeEarlyArrival;
    private String availabilityId;
    private String destinationId;
    private String resortId;
    private String roomTypeId;
    private Boolean disneyOwned;
    private Boolean disneyOperated;
    private Boolean onProperty;
    private Booking booking;
    private String marketingOfferId;
    private List<String> policyIds = new ArrayList<String>();
    private Boolean accessible;
    private List<String> affiliations = new ArrayList<String>();
    private String planTypeId;
    private String planTypeUrlFriendlyId;
    private String planTypeName;
    private String packageName;
    private String packageId;
    private List<IncludedComponent> includedComponents = new ArrayList<IncludedComponent>();
    private List<SupportedComponent> supportedComponents = new ArrayList<SupportedComponent>();
    private AnalyticsIdentifiers analyticsIdentifiers;
    private Boolean holdEligible;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links__ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links__ links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The reservationDates
     */
    public ReservationDates getReservationDates() {
        return reservationDates;
    }

    /**
     * 
     * @param reservationDates
     *     The reservationDates
     */
    public void setReservationDates(ReservationDates reservationDates) {
        this.reservationDates = reservationDates;
    }

    /**
     * 
     * @return
     *     The partyMix
     */
    public PartyMix getPartyMix() {
        return partyMix;
    }

    /**
     * 
     * @param partyMix
     *     The partyMix
     */
    public void setPartyMix(PartyMix partyMix) {
        this.partyMix = partyMix;
    }

    /**
     * 
     * @return
     *     The unitPrice
     */
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * @param unitPrice
     *     The unitPrice
     */
    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @return
     *     The nightlyPrices
     */
    public NightlyPrices getNightlyPrices() {
        return nightlyPrices;
    }

    /**
     * 
     * @param nightlyPrices
     *     The nightlyPrices
     */
    public void setNightlyPrices(NightlyPrices nightlyPrices) {
        this.nightlyPrices = nightlyPrices;
    }

    /**
     * 
     * @return
     *     The prioritizeEarlyArrival
     */
    public Boolean getPrioritizeEarlyArrival() {
        return prioritizeEarlyArrival;
    }

    /**
     * 
     * @param prioritizeEarlyArrival
     *     The prioritizeEarlyArrival
     */
    public void setPrioritizeEarlyArrival(Boolean prioritizeEarlyArrival) {
        this.prioritizeEarlyArrival = prioritizeEarlyArrival;
    }

    /**
     * 
     * @return
     *     The availabilityId
     */
    public String getAvailabilityId() {
        return availabilityId;
    }

    /**
     * 
     * @param availabilityId
     *     The availabilityId
     */
    public void setAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
    }

    /**
     * 
     * @return
     *     The destinationId
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * 
     * @param destinationId
     *     The destinationId
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * 
     * @return
     *     The resortId
     */
    public String getResortId() {
        return resortId;
    }

    /**
     * 
     * @param resortId
     *     The resortId
     */
    public void setResortId(String resortId) {
        this.resortId = resortId;
    }

    /**
     * 
     * @return
     *     The roomTypeId
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * 
     * @param roomTypeId
     *     The roomTypeId
     */
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    /**
     * 
     * @return
     *     The disneyOwned
     */
    public Boolean getDisneyOwned() {
        return disneyOwned;
    }

    /**
     * 
     * @param disneyOwned
     *     The disneyOwned
     */
    public void setDisneyOwned(Boolean disneyOwned) {
        this.disneyOwned = disneyOwned;
    }

    /**
     * 
     * @return
     *     The disneyOperated
     */
    public Boolean getDisneyOperated() {
        return disneyOperated;
    }

    /**
     * 
     * @param disneyOperated
     *     The disneyOperated
     */
    public void setDisneyOperated(Boolean disneyOperated) {
        this.disneyOperated = disneyOperated;
    }

    /**
     * 
     * @return
     *     The onProperty
     */
    public Boolean getOnProperty() {
        return onProperty;
    }

    /**
     * 
     * @param onProperty
     *     The onProperty
     */
    public void setOnProperty(Boolean onProperty) {
        this.onProperty = onProperty;
    }

    /**
     * 
     * @return
     *     The booking
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * 
     * @param booking
     *     The booking
     */
    public void setBooking(Booking booking) {
        this.booking = booking;
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
     *     The policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    /**
     * 
     * @param policyIds
     *     The policyIds
     */
    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    /**
     * 
     * @return
     *     The accessible
     */
    public Boolean getAccessible() {
        return accessible;
    }

    /**
     * 
     * @param accessible
     *     The accessible
     */
    public void setAccessible(Boolean accessible) {
        this.accessible = accessible;
    }

    /**
     * 
     * @return
     *     The affiliations
     */
    public List<String> getAffiliations() {
        return affiliations;
    }

    /**
     * 
     * @param affiliations
     *     The affiliations
     */
    public void setAffiliations(List<String> affiliations) {
        this.affiliations = affiliations;
    }

    /**
     * 
     * @return
     *     The planTypeId
     */
    public String getPlanTypeId() {
        return planTypeId;
    }

    /**
     * 
     * @param planTypeId
     *     The planTypeId
     */
    public void setPlanTypeId(String planTypeId) {
        this.planTypeId = planTypeId;
    }

    /**
     * 
     * @return
     *     The planTypeUrlFriendlyId
     */
    public String getPlanTypeUrlFriendlyId() {
        return planTypeUrlFriendlyId;
    }

    /**
     * 
     * @param planTypeUrlFriendlyId
     *     The planTypeUrlFriendlyId
     */
    public void setPlanTypeUrlFriendlyId(String planTypeUrlFriendlyId) {
        this.planTypeUrlFriendlyId = planTypeUrlFriendlyId;
    }

    /**
     * 
     * @return
     *     The planTypeName
     */
    public String getPlanTypeName() {
        return planTypeName;
    }

    /**
     * 
     * @param planTypeName
     *     The planTypeName
     */
    public void setPlanTypeName(String planTypeName) {
        this.planTypeName = planTypeName;
    }

    /**
     * 
     * @return
     *     The packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 
     * @param packageName
     *     The packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
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
     *     The includedComponents
     */
    public List<IncludedComponent> getIncludedComponents() {
        return includedComponents;
    }

    /**
     * 
     * @param includedComponents
     *     The includedComponents
     */
    public void setIncludedComponents(List<IncludedComponent> includedComponents) {
        this.includedComponents = includedComponents;
    }

    /**
     * 
     * @return
     *     The supportedComponents
     */
    public List<SupportedComponent> getSupportedComponents() {
        return supportedComponents;
    }

    /**
     * 
     * @param supportedComponents
     *     The supportedComponents
     */
    public void setSupportedComponents(List<SupportedComponent> supportedComponents) {
        this.supportedComponents = supportedComponents;
    }

    /**
     * 
     * @return
     *     The analyticsIdentifiers
     */
    public AnalyticsIdentifiers getAnalyticsIdentifiers() {
        return analyticsIdentifiers;
    }

    /**
     * 
     * @param analyticsIdentifiers
     *     The analyticsIdentifiers
     */
    public void setAnalyticsIdentifiers(AnalyticsIdentifiers analyticsIdentifiers) {
        this.analyticsIdentifiers = analyticsIdentifiers;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
