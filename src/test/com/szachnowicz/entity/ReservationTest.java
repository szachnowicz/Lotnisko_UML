package com.szachnowicz.entity;

import com.szachnowicz.entity.Reservation;
import com.szachnowicz.repo.ReservationRepository;
import com.szachnowicz.service.ReservationService;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class ReservationTest {
    private Reservation rest;
    private ReservationService reservationService;

    @Before
    public void setUp() throws Exception {
        rest = new Reservation();
        rest.setClientId(0);
        rest.setFlightDate(new Date());
        rest.setFlightId(100);
        rest.setPrice(new BigDecimal("1000"));
        reservationService = new ReservationService();
    }

    @Test
    public void formatDateTest() {
        System.out.println(rest.getDateFormat());
        assertEquals(rest.getDateFormat(), "2017-12-21");
    }


    @Test
    public void addingDuplicatedData() {
        reservationService.addReservation(1, new BigDecimal("3000"), "2017-12-12", 123);
        ReservationRepository repository = reservationService.getRepository();
        assertEquals(repository.getReservationSet().size(), 1);
        reservationService.addReservation(1, new BigDecimal("3000"), "2017-12-12", 123);
        assertEquals(repository.getReservationSet().size(), 1);

    }


    @Test
    public void removingReservation() {
        reservationService.addReservation(1, new BigDecimal("123"), "2016-12-12", 1);
        reservationService.addReservation(2, new BigDecimal("123"), "2016-12-12", 1);
        reservationService.addReservation(3, new BigDecimal("123"), "2016-12-12", 1);
        reservationService.addReservation(4, new BigDecimal("123"), "2016-12-12", 1);

        ReservationRepository repository = reservationService.getRepository();
        assertEquals(repository.getReservationSet().size(), 1);
        reservationService.removeReservationByReservationId(1);
        assertEquals(repository.getReservationSet().size(), 0);

    }


}