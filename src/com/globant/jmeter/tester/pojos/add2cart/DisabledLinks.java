
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DisabledLinks {

    private String getInsuranceForm;
    private String getPersonalMagicForm;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The getInsuranceForm
     */
    public String getGetInsuranceForm() {
        return getInsuranceForm;
    }

    /**
     * 
     * @param getInsuranceForm
     *     The getInsuranceForm
     */
    public void setGetInsuranceForm(String getInsuranceForm) {
        this.getInsuranceForm = getInsuranceForm;
    }

    /**
     * 
     * @return
     *     The getPersonalMagicForm
     */
    public String getGetPersonalMagicForm() {
        return getPersonalMagicForm;
    }

    /**
     * 
     * @param getPersonalMagicForm
     *     The getPersonalMagicForm
     */
    public void setGetPersonalMagicForm(String getPersonalMagicForm) {
        this.getPersonalMagicForm = getPersonalMagicForm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
