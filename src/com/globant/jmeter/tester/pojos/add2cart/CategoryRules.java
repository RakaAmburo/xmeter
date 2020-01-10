
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CategoryRules {

    private Room_ room;
    private Tickets tickets;
    private Dine dine;
    private PersonalMagic personalMagic;
    private Flight flight;
    private Ground ground;
    private Insurance insurance;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The room
     */
    public Room_ getRoom() {
        return room;
    }

    /**
     * 
     * @param room
     *     The room
     */
    public void setRoom(Room_ room) {
        this.room = room;
    }

    /**
     * 
     * @return
     *     The tickets
     */
    public Tickets getTickets() {
        return tickets;
    }

    /**
     * 
     * @param tickets
     *     The tickets
     */
    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    /**
     * 
     * @return
     *     The dine
     */
    public Dine getDine() {
        return dine;
    }

    /**
     * 
     * @param dine
     *     The dine
     */
    public void setDine(Dine dine) {
        this.dine = dine;
    }

    /**
     * 
     * @return
     *     The personalMagic
     */
    public PersonalMagic getPersonalMagic() {
        return personalMagic;
    }

    /**
     * 
     * @param personalMagic
     *     The personalMagic
     */
    public void setPersonalMagic(PersonalMagic personalMagic) {
        this.personalMagic = personalMagic;
    }

    /**
     * 
     * @return
     *     The flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * 
     * @param flight
     *     The flight
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * 
     * @return
     *     The ground
     */
    public Ground getGround() {
        return ground;
    }

    /**
     * 
     * @param ground
     *     The ground
     */
    public void setGround(Ground ground) {
        this.ground = ground;
    }

    /**
     * 
     * @return
     *     The insurance
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * 
     * @param insurance
     *     The insurance
     */
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
