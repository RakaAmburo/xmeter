
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WdwOfferBookNow {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("analyticsId")
    @Expose
    private String analyticsId;

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 
     * @return
     *     The analyticsId
     */
    public String getAnalyticsId() {
        return analyticsId;
    }

    /**
     * 
     * @param analyticsId
     *     The analyticsId
     */
    public void setAnalyticsId(String analyticsId) {
        this.analyticsId = analyticsId;
    }

}
