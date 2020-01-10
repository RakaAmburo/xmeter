
package com.globant.jmeter.tester.pojos.offer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Facets {

    @SerializedName("offerTypes")
    @Expose
    private List<OfferType> offerTypes = new ArrayList<OfferType>();

    /**
     * 
     * @return
     *     The offerTypes
     */
    public List<OfferType> getOfferTypes() {
        return offerTypes;
    }

    /**
     * 
     * @param offerTypes
     *     The offerTypes
     */
    public void setOfferTypes(List<OfferType> offerTypes) {
        this.offerTypes = offerTypes;
    }

}
