
package com.globant.jmeter.tester.pojos.offer;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DefaultComponentGroup {

    @SerializedName("components")
    @Expose
    private List<Component> components = new ArrayList<Component>();

    /**
     * 
     * @return
     *     The components
     */
    public List<Component> getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
