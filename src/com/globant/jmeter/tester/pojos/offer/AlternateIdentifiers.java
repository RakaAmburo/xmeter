
package com.globant.jmeter.tester.pojos.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AlternateIdentifiers {

    @SerializedName("packager")
    @Expose
    private Packager packager;
    @SerializedName("associated")
    @Expose
    private Associated associated;
    @SerializedName("oneSource")
    @Expose
    private OneSource oneSource;
    @SerializedName("urlFriendly")
    @Expose
    private UrlFriendly urlFriendly;
    @SerializedName("canonicalHandle")
    @Expose
    private CanonicalHandle canonicalHandle;
    @SerializedName("analytics")
    @Expose
    private Analytics analytics;

    /**
     * 
     * @return
     *     The packager
     */
    public Packager getPackager() {
        return packager;
    }

    /**
     * 
     * @param packager
     *     The packager
     */
    public void setPackager(Packager packager) {
        this.packager = packager;
    }

    /**
     * 
     * @return
     *     The associated
     */
    public Associated getAssociated() {
        return associated;
    }

    /**
     * 
     * @param associated
     *     The associated
     */
    public void setAssociated(Associated associated) {
        this.associated = associated;
    }

    /**
     * 
     * @return
     *     The oneSource
     */
    public OneSource getOneSource() {
        return oneSource;
    }

    /**
     * 
     * @param oneSource
     *     The oneSource
     */
    public void setOneSource(OneSource oneSource) {
        this.oneSource = oneSource;
    }

    /**
     * 
     * @return
     *     The urlFriendly
     */
    public UrlFriendly getUrlFriendly() {
        return urlFriendly;
    }

    /**
     * 
     * @param urlFriendly
     *     The urlFriendly
     */
    public void setUrlFriendly(UrlFriendly urlFriendly) {
        this.urlFriendly = urlFriendly;
    }

    /**
     * 
     * @return
     *     The canonicalHandle
     */
    public CanonicalHandle getCanonicalHandle() {
        return canonicalHandle;
    }

    /**
     * 
     * @param canonicalHandle
     *     The canonicalHandle
     */
    public void setCanonicalHandle(CanonicalHandle canonicalHandle) {
        this.canonicalHandle = canonicalHandle;
    }

    /**
     * 
     * @return
     *     The analytics
     */
    public Analytics getAnalytics() {
        return analytics;
    }

    /**
     * 
     * @param analytics
     *     The analytics
     */
    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

}
