
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Booking {

    private String offerRequestIdentifier;
    private String roomPriceQuoteIdentifier;
    private String candidateOfferIdentifier;
    private String roomTypeCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The offerRequestIdentifier
     */
    public String getOfferRequestIdentifier() {
        return offerRequestIdentifier;
    }

    /**
     * 
     * @param offerRequestIdentifier
     *     The offerRequestIdentifier
     */
    public void setOfferRequestIdentifier(String offerRequestIdentifier) {
        this.offerRequestIdentifier = offerRequestIdentifier;
    }

    /**
     * 
     * @return
     *     The roomPriceQuoteIdentifier
     */
    public String getRoomPriceQuoteIdentifier() {
        return roomPriceQuoteIdentifier;
    }

    /**
     * 
     * @param roomPriceQuoteIdentifier
     *     The roomPriceQuoteIdentifier
     */
    public void setRoomPriceQuoteIdentifier(String roomPriceQuoteIdentifier) {
        this.roomPriceQuoteIdentifier = roomPriceQuoteIdentifier;
    }

    /**
     * 
     * @return
     *     The candidateOfferIdentifier
     */
    public String getCandidateOfferIdentifier() {
        return candidateOfferIdentifier;
    }

    /**
     * 
     * @param candidateOfferIdentifier
     *     The candidateOfferIdentifier
     */
    public void setCandidateOfferIdentifier(String candidateOfferIdentifier) {
        this.candidateOfferIdentifier = candidateOfferIdentifier;
    }

    /**
     * 
     * @return
     *     The roomTypeCode
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * 
     * @param roomTypeCode
     *     The roomTypeCode
     */
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
