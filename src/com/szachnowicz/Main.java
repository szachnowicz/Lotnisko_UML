package com.szachnowicz;

import com.szachnowicz.service.ReservationService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {








        Main main = new Main();
        System.out.println("OPCJE");
        System.out.println("1 : Dodaj rezerwacje");
        System.out.println("2 : Usun Rezerwacje");
        System.out.println();
        System.out.println();
        ReservationService reservationService = new ReservationService();

          scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Wybierz opjce");
            int choose = scanner.nextInt();
            if(choose ==1 )
            {
                main.dispalyAddingReservation(reservationService);
            }

        }
    }

    private void dispalyAddingReservation(ReservationService reservationService) {

        System.out.println("Podaj client ID");
        String clientID = scanner.next();
        long clientId = Long.parseLong(clientID);
        System.out.println("Podaj podaj ID lotu");
        String flightID = scanner.next();
        long flightId = Long.parseLong(flightID);
        System.out.println("Podaj date wylotu");
        String date = scanner.next();

        System.out.println("Podaj ile klient wpłacił do");
        String price = scanner.next();
        BigDecimal pirce = new BigDecimal(price);

        reservationService.addReservation(clientId,pirce,date,flightId);

    }
}
