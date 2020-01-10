
package com.globant.jmeter.tester.pojos.shallow;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ReasonsUnavailable {

    private String reasonCode;
    private ResortPackage resortPackage;
    private Resort resort;
    private RoomType roomType;
    private String rateType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The reasonCode
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 
     * @param reasonCode
     *     The reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * 
     * @return
     *     The resortPackage
     */
    public ResortPackage getResortPackage() {
        return resortPackage;
    }

    /**
     * 
     * @param resortPackage
     *     The resortPackage
     */
    public void setResortPackage(ResortPackage resortPackage) {
        this.resortPackage = resortPackage;
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
     *     The rateType
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     * @param rateType
     *     The rateType
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
