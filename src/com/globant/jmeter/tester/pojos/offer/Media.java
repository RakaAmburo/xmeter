
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Media {

    @SerializedName("offersFaceBook")
    @Expose
    private OffersFaceBook offersFaceBook;
    @SerializedName("finderStandardThumb")
    @Expose
    private FinderStandardThumb finderStandardThumb;
    @SerializedName("headerSliver")
    @Expose
    private HeaderSliver headerSliver;

    /**
     * 
     * @return
     *     The offersFaceBook
     */
    public OffersFaceBook getOffersFaceBook() {
        return offersFaceBook;
    }

    /**
     * 
     * @param offersFaceBook
     *     The offersFaceBook
     */
    public void setOffersFaceBook(OffersFaceBook offersFaceBook) {
        this.offersFaceBook = offersFaceBook;
    }

    /**
     * 
     * @return
     *     The finderStandardThumb
     */
    public FinderStandardThumb getFinderStandardThumb() {
        return finderStandardThumb;
    }

    /**
     * 
     * @param finderStandardThumb
     *     The finderStandardThumb
     */
    public void setFinderStandardThumb(FinderStandardThumb finderStandardThumb) {
        this.finderStandardThumb = finderStandardThumb;
    }

    /**
     * 
     * @return
     *     The headerSliver
     */
    public HeaderSliver getHeaderSliver() {
        return headerSliver;
    }

    /**
     * 
     * @param headerSliver
     *     The headerSliver
     */
    public void setHeaderSliver(HeaderSliver headerSliver) {
        this.headerSliver = headerSliver;
    }

}
