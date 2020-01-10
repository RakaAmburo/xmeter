
package com.globant.jmeter.tester.pojos.shallow;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ReasonsUnavailable___________________________ {

    private String reasonCode;
    private ResortPackage_______________________ resortPackage;
    private Resort___________________________ resort;
    private RoomType___________________________ roomType;
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
    public ResortPackage_______________________ getResortPackage() {
        return resortPackage;
    }

    /**
     * 
     * @param resortPackage
     *     The resortPackage
     */
    public void setResortPackage(ResortPackage_______________________ resortPackage) {
        this.resortPackage = resortPackage;
    }

    /**
     * 
     * @return
     *     The resort
     */
    public Resort___________________________ getResort() {
        return resort;
    }

    /**
     * 
     * @param resort
     *     The resort
     */
    public void setResort(Resort___________________________ resort) {
        this.resort = resort;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    public RoomType___________________________ getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The roomType
     */
    public void setRoomType(RoomType___________________________ roomType) {
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
