
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Links__ {

    private Update_ update;
    private Remove_ remove;
    private RoomType roomType;
    private MarketingOffer_ marketingOffer;
    private Resort resort;
    private Availability availability;
    private Destination destination;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The update
     */
    public Update_ getUpdate() {
        return update;
    }

    /**
     * 
     * @param update
     *     The update
     */
    public void setUpdate(Update_ update) {
        this.update = update;
    }

    /**
     * 
     * @return
     *     The remove
     */
    public Remove_ getRemove() {
        return remove;
    }

    /**
     * 
     * @param remove
     *     The remove
     */
    public void setRemove(Remove_ remove) {
        this.remove = remove;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The roomType
     */
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    /**
     * 
     * @return
     *     The marketingOffer
     */
    public MarketingOffer_ getMarketingOffer() {
        return marketingOffer;
    }

    /**
     * 
     * @param marketingOffer
     *     The marketingOffer
     */
    public void setMarketingOffer(MarketingOffer_ marketingOffer) {
        this.marketingOffer = marketingOffer;
    }

    /**
     * 
     * @return
     *     The resort
     */
    public Resort getResort() {
        return resort;
    }

    /**
     * 
     * @param resort
     *     The resort
     */
    public void setResort(Resort resort) {
        this.resort = resort;
    }

    /**
     * 
     * @return
     *     The availability
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * 
     * @param availability
     *     The availability
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
