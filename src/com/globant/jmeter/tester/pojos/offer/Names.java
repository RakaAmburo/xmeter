
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Names {

    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("standardName")
    @Expose
    private String standardName;

    /**
     * 
     * @return
     *     The longName
     */
    public String getLongName() {
        return longName;
    }

    /**
     * 
     * @param longName
     *     The longName
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 
     * @param shortName
     *     The shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 
     * @return
     *     The standardName
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * 
     * @param standardName
     *     The standardName
     */
    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

}
