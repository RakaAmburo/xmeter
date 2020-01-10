
package com.globant.jmeter.tester.pojos.offer;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sections______ {

    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("readMore")
    @Expose
    private String readMore;
    @SerializedName("readAll")
    @Expose
    private String readAll;

    /**
     * 
     * @return
     *     The header
     */
    public String getHeader() {
        return header;
    }

    /**
     * 
     * @param header
     *     The header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 
     * @return
     *     The readMore
     */
    public String getReadMore() {
        return readMore;
    }

    /**
     * 
     * @param readMore
     *     The readMore
     */
    public void setReadMore(String readMore) {
        this.readMore = readMore;
    }

    /**
     * 
     * @return
     *     The readAll
     */
    public String getReadAll() {
        return readAll;
    }

    /**
     * 
     * @param readAll
     *     The readAll
     */
    public void setReadAll(String readAll) {
        this.readAll = readAll;
    }

}
