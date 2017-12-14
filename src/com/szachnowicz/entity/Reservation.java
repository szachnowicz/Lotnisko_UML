package com.szachnowicz.entity;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Reservation {

    private long id;
    private long flightId;
    private long clientId;

    private Date flightDate;
    private BigDecimal price;

    public long getId() {
        return id;
    }


    public String getDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd").format(getFlightDate());
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFlightId() {
        return flightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id &&
                flightId == that.flightId &&
                clientId == that.clientId &&
                Objects.equals(flightDate, that.flightDate) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, flightId, clientId, flightDate, price);
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public void setFlightDateFromString(String flightDate)  {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(flightDate);
            setFlightDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", flightId=" + flightId +
                ", clientId=" + clientId +
                ", flightDate=" + getDateFormat() +
                ", price=" + price +
                '}';
    }
}
