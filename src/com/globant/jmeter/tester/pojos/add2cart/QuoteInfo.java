
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class QuoteInfo {

    private String currency;
    private MinimumDepositDueAmount minimumDepositDueAmount;
    private String depositDueDate;
    private BalanceDueAmount balanceDueAmount;
    private String balanceDueDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The minimumDepositDueAmount
     */
    public MinimumDepositDueAmount getMinimumDepositDueAmount() {
        return minimumDepositDueAmount;
    }

    /**
     * 
     * @param minimumDepositDueAmount
     *     The minimumDepositDueAmount
     */
    public void setMinimumDepositDueAmount(MinimumDepositDueAmount minimumDepositDueAmount) {
        this.minimumDepositDueAmount = minimumDepositDueAmount;
    }

    /**
     * 
     * @return
     *     The depositDueDate
     */
    public String getDepositDueDate() {
        return depositDueDate;
    }

    /**
     * 
     * @param depositDueDate
     *     The depositDueDate
     */
    public void setDepositDueDate(String depositDueDate) {
        this.depositDueDate = depositDueDate;
    }

    /**
     * 
     * @return
     *     The balanceDueAmount
     */
    public BalanceDueAmount getBalanceDueAmount() {
        return balanceDueAmount;
    }

    /**
     * 
     * @param balanceDueAmount
     *     The balanceDueAmount
     */
    public void setBalanceDueAmount(BalanceDueAmount balanceDueAmount) {
        this.balanceDueAmount = balanceDueAmount;
    }

    /**
     * 
     * @return
     *     The balanceDueDate
     */
    public String getBalanceDueDate() {
        return balanceDueDate;
    }

    /**
     * 
     * @param balanceDueDate
     *     The balanceDueDate
     */
    public void setBalanceDueDate(String balanceDueDate) {
        this.balanceDueDate = balanceDueDate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
