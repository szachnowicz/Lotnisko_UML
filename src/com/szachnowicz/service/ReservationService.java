package com.szachnowicz.service;

import com.szachnowicz.entity.Reservation;
import com.szachnowicz.repo.ReservationRepository;

import java.math.BigDecimal;
import java.util.Date;

public class ReservationService {
    private ReservationRepository repository;

    public ReservationService() {
        repository = new ReservationRepository();
    }


    public ReservationRepository getRepository() {
        return repository;
    }


    public void removeReservationByReservationId(long reservationId) {
        Reservation byId = repository.getById(reservationId);
        repository.delete(byId);
    }




    public void addReservation(long idClient, BigDecimal price, String flightDate, long flightId )
    {
        Reservation reservation = new Reservation();
        reservation.setId(repository.getReservationSet().size()+1);
        reservation.setClientId(idClient);
        reservation.setPrice(price);
        reservation.setFlightId(flightId);
        reservation.setFlightDateFromString(flightDate);
        repository.add(reservation);
        System.out.println("reservtion Adeed");

    }








}
