package com.szachnowicz.entity;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class ReservationTest {
    private Reservation rest;

    @Before
    public void setUp() throws Exception {
         rest = new Reservation();
        rest.setClientId(0);
        rest.setFlightDate(new Date());
        rest.setFlightId(100);
        rest.setPrice(new BigDecimal("1000"));
    }

    @Test
    public void formatDateTest() {
        System.out.println(rest.getDateFormat());
        assertEquals(rest.getDateFormat(), "2017-12-14");

    }


}