
package com.globant.jmeter.tester.pojos.offer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Offer {

    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("names")
    @Expose
    private Names names;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("subType")
    @Expose
    private String subType;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("bookingStartDate")
    @Expose
    private String bookingStartDate;
    @SerializedName("bookingEndDate")
    @Expose
    private String bookingEndDate;
    @SerializedName("travelStartDate")
    @Expose
    private String travelStartDate;
    @SerializedName("travelEndDate")
    @Expose
    private String travelEndDate;
    @SerializedName("descriptions")
    @Expose
    private Descriptions descriptions;
    @SerializedName("alternateIdentifiers")
    @Expose
    private AlternateIdentifiers alternateIdentifiers;
    @SerializedName("webLinks")
    @Expose
    private WebLinks webLinks;
    @SerializedName("affiliations")
    @Expose
    private List<Affiliation> affiliations = new ArrayList<Affiliation>();
    @SerializedName("minLengthOfStay")
    @Expose
    private Integer minLengthOfStay;
    @SerializedName("maxLengthOfStay")
    @Expose
    private Integer maxLengthOfStay;
    @SerializedName("applicableUserTypes")
    @Expose
    private List<String> applicableUserTypes = new ArrayList<String>();
    @SerializedName("featuredOffer")
    @Expose
    private Boolean featuredOffer;
    @SerializedName("countdownDisplayDate")
    @Expose
    private String countdownDisplayDate;
    @SerializedName("marketingPrice")
    @Expose
    private MarketingPrice marketingPrice;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("validTravelDates")
    @Expose
    private List<ValidTravelDate> validTravelDates = new ArrayList<ValidTravelDate>();
    @SerializedName("packages")
    @Expose
    private List<Package> packages = new ArrayList<Package>();
    @SerializedName("resorts")
    @Expose
    private List<Resort> resorts = new ArrayList<Resort>();
    @SerializedName("defaultComponentGroups")
    @Expose
    private List<DefaultComponentGroup> defaultComponentGroups = new ArrayList<DefaultComponentGroup>();
    @SerializedName("displayOrder")
    @Expose
    private Integer displayOrder;
    @SerializedName("planTypeGroups")
    @Expose
    private List<PlanTypeGroup> planTypeGroups = new ArrayList<PlanTypeGroup>();
    @SerializedName("name")
    @Expose
    private String name;

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
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The names
     */
    public Names getNames() {
        return names;
    }

    /**
     * 
     * @param names
     *     The names
     */
    public void setNames(Names names) {
        this.names = names;
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
     *     The subType
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 
     * @param subType
     *     The subType
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The bookingStartDate
     */
    public String getBookingStartDate() {
        return bookingStartDate;
    }

    /**
     * 
     * @param bookingStartDate
     *     The bookingStartDate
     */
    public void setBookingStartDate(String bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    /**
     * 
     * @return
     *     The bookingEndDate
     */
    public String getBookingEndDate() {
        return bookingEndDate;
    }

    /**
     * 
     * @param bookingEndDate
     *     The bookingEndDate
     */
    public void setBookingEndDate(String bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    /**
     * 
     * @return
     *     The travelStartDate
     */
    public String getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * 
     * @param travelStartDate
     *     The travelStartDate
     */
    public void setTravelStartDate(String travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    /**
     * 
     * @return
     *     The travelEndDate
     */
    public String getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * 
     * @param travelEndDate
     *     The travelEndDate
     */
    public void setTravelEndDate(String travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    /**
     * 
     * @return
     *     The descriptions
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 
     * @param descriptions
     *     The descriptions
     */
    public void setDescriptions(Descriptions descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * 
     * @return
     *     The alternateIdentifiers
     */
    public AlternateIdentifiers getAlternateIdentifiers() {
        return alternateIdentifiers;
    }

    /**
     * 
     * @param alternateIdentifiers
     *     The alternateIdentifiers
     */
    public void setAlternateIdentifiers(AlternateIdentifiers alternateIdentifiers) {
        this.alternateIdentifiers = alternateIdentifiers;
    }

    /**
     * 
     * @return
     *     The webLinks
     */
    public WebLinks getWebLinks() {
        return webLinks;
    }

    /**
     * 
     * @param webLinks
     *     The webLinks
     */
    public void setWebLinks(WebLinks webLinks) {
        this.webLinks = webLinks;
    }

    /**
     * 
     * @return
     *     The affiliations
     */
    public List<Affiliation> getAffiliations() {
        return affiliations;
    }

    /**
     * 
     * @param affiliations
     *     The affiliations
     */
    public void setAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }

    /**
     * 
     * @return
     *     The minLengthOfStay
     */
    public Integer getMinLengthOfStay() {
        return minLengthOfStay;
    }

    /**
     * 
     * @param minLengthOfStay
     *     The minLengthOfStay
     */
    public void setMinLengthOfStay(Integer minLengthOfStay) {
        this.minLengthOfStay = minLengthOfStay;
    }

    /**
     * 
     * @return
     *     The maxLengthOfStay
     */
    public Integer getMaxLengthOfStay() {
        return maxLengthOfStay;
    }

    /**
     * 
     * @param maxLengthOfStay
     *     The maxLengthOfStay
     */
    public void setMaxLengthOfStay(Integer maxLengthOfStay) {
        this.maxLengthOfStay = maxLengthOfStay;
    }

    /**
     * 
     * @return
     *     The applicableUserTypes
     */
    public List<String> getApplicableUserTypes() {
        return applicableUserTypes;
    }

    /**
     * 
     * @param applicableUserTypes
     *     The applicableUserTypes
     */
    public void setApplicableUserTypes(List<String> applicableUserTypes) {
        this.applicableUserTypes = applicableUserTypes;
    }

    /**
     * 
     * @return
     *     The featuredOffer
     */
    public Boolean getFeaturedOffer() {
        return featuredOffer;
    }

    /**
     * 
     * @param featuredOffer
     *     The featuredOffer
     */
    public void setFeaturedOffer(Boolean featuredOffer) {
        this.featuredOffer = featuredOffer;
    }

    /**
     * 
     * @return
     *     The countdownDisplayDate
     */
    public String getCountdownDisplayDate() {
        return countdownDisplayDate;
    }

    /**
     * 
     * @param countdownDisplayDate
     *     The countdownDisplayDate
     */
    public void setCountdownDisplayDate(String countdownDisplayDate) {
        this.countdownDisplayDate = countdownDisplayDate;
    }

    /**
     * 
     * @return
     *     The marketingPrice
     */
    public MarketingPrice getMarketingPrice() {
        return marketingPrice;
    }

    /**
     * 
     * @param marketingPrice
     *     The marketingPrice
     */
    public void setMarketingPrice(MarketingPrice marketingPrice) {
        this.marketingPrice = marketingPrice;
    }

    /**
     * 
     * @return
     *     The media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The facets
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The facets
     */
    public void setFacets(Facets facets) {
        this.facets = facets;
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
     *     The validTravelDates
     */
    public List<ValidTravelDate> getValidTravelDates() {
        return validTravelDates;
    }

    /**
     * 
     * @param validTravelDates
     *     The validTravelDates
     */
    public void setValidTravelDates(List<ValidTravelDate> validTravelDates) {
        this.validTravelDates = validTravelDates;
    }

    /**
     * 
     * @return
     *     The packages
     */
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * 
     * @param packages
     *     The packages
     */
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    /**
     * 
     * @return
     *     The resorts
     */
    public List<Resort> getResorts() {
        return resorts;
    }

    /**
     * 
     * @param resorts
     *     The resorts
     */
    public void setResorts(List<Resort> resorts) {
        this.resorts = resorts;
    }

    /**
     * 
     * @return
     *     The defaultComponentGroups
     */
    public List<DefaultComponentGroup> getDefaultComponentGroups() {
        return defaultComponentGroups;
    }

    /**
     * 
     * @param defaultComponentGroups
     *     The defaultComponentGroups
     */
    public void setDefaultComponentGroups(List<DefaultComponentGroup> defaultComponentGroups) {
        this.defaultComponentGroups = defaultComponentGroups;
    }

    /**
     * 
     * @return
     *     The displayOrder
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 
     * @param displayOrder
     *     The displayOrder
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * 
     * @return
     *     The planTypeGroups
     */
    public List<PlanTypeGroup> getPlanTypeGroups() {
        return planTypeGroups;
    }

    /**
     * 
     * @param planTypeGroups
     *     The planTypeGroups
     */
    public void setPlanTypeGroups(List<PlanTypeGroup> planTypeGroups) {
        this.planTypeGroups = planTypeGroups;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
