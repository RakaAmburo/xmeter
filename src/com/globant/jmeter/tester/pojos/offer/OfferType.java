
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class OfferType {

    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("urlFriendlyId")
    @Expose
    private String urlFriendlyId;

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
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
     *     The urlFriendlyId
     */
    public String getUrlFriendlyId() {
        return urlFriendlyId;
    }

    /**
     * 
     * @param urlFriendlyId
     *     The urlFriendlyId
     */
    public void setUrlFriendlyId(String urlFriendlyId) {
        this.urlFriendlyId = urlFriendlyId;
    }

}
