
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Pricing_ {

    private String subtotal;
    private String tax;
    private String commission;
    private String total;
    private Boolean taxIncluded;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The subtotal
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * 
     * @param subtotal
     *     The subtotal
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * 
     * @return
     *     The tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * 
     * @param tax
     *     The tax
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * 
     * @return
     *     The commission
     */
    public String getCommission() {
        return commission;
    }

    /**
     * 
     * @param commission
     *     The commission
     */
    public void setCommission(String commission) {
        this.commission = commission;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The taxIncluded
     */
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * 
     * @param taxIncluded
     *     The taxIncluded
     */
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
