
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WebLinks {

    @SerializedName("wdwOfferHighlights")
    @Expose
    private WdwOfferHighlights wdwOfferHighlights;
    @SerializedName("wdwOfferBookNow")
    @Expose
    private WdwOfferBookNow wdwOfferBookNow;
    @SerializedName("wdwOfferDetail")
    @Expose
    private WdwOfferDetail wdwOfferDetail;

    /**
     * 
     * @return
     *     The wdwOfferHighlights
     */
    public WdwOfferHighlights getWdwOfferHighlights() {
        return wdwOfferHighlights;
    }

    /**
     * 
     * @param wdwOfferHighlights
     *     The wdwOfferHighlights
     */
    public void setWdwOfferHighlights(WdwOfferHighlights wdwOfferHighlights) {
        this.wdwOfferHighlights = wdwOfferHighlights;
    }

    /**
     * 
     * @return
     *     The wdwOfferBookNow
     */
    public WdwOfferBookNow getWdwOfferBookNow() {
        return wdwOfferBookNow;
    }

    /**
     * 
     * @param wdwOfferBookNow
     *     The wdwOfferBookNow
     */
    public void setWdwOfferBookNow(WdwOfferBookNow wdwOfferBookNow) {
        this.wdwOfferBookNow = wdwOfferBookNow;
    }

    /**
     * 
     * @return
     *     The wdwOfferDetail
     */
    public WdwOfferDetail getWdwOfferDetail() {
        return wdwOfferDetail;
    }

    /**
     * 
     * @param wdwOfferDetail
     *     The wdwOfferDetail
     */
    public void setWdwOfferDetail(WdwOfferDetail wdwOfferDetail) {
        this.wdwOfferDetail = wdwOfferDetail;
    }

}
