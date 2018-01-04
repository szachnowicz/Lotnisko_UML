package com.szachnowicz.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight {
    private long id;
    private String dockCity;
    private String destinationCity;
    private long machnieId;
    private Date flightDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDockCity() {
        return dockCity;
    }

    public void setDockCity(String dockCity) {
        this.dockCity = dockCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public long getMachnieId() {
        return machnieId;
    }

    public void setMachnieId(long machnieId) {
        this.machnieId = machnieId;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public void setFlightDateFromString(String flightDate) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(flightDate);
            setFlightDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
