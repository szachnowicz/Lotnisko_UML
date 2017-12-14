package com.szachnowicz.repo;

import com.szachnowicz.entity.Reservation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReservationRepository implements Repository<Reservation> {
    public ReservationRepository() {

        if (reservationSet == null) {
            reservationSet = new HashSet<>();
        }
    }

    public static Set<Reservation> reservationSet;


    @Override
    public void update(Reservation item) {

    }

    @Override
    public void delete(Reservation item) {

    }

    @Override
    public void addAll(List<Reservation> itemList) {

    }

    public static Set<Reservation> getReservationSet() {
        return reservationSet;
    }

    @Override
    public void add(Reservation item) {
        reservationSet.add(item);
        System.out.println("Reservation aded ");
        System.out.println(item.toString());
    }


}
