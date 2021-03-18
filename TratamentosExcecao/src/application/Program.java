package application;

import model.entites.Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // metodo 1 : Ruim.
        System.out.print("Room number : ");
        int number = scan.nextInt();
        System.out.print("Check-in date : ");
        Date checkin = sdf.parse(scan.next());
        System.out.print("Check-Out date : ");
        Date chackout = sdf.parse(scan.next());

        if (!chackout.after(checkin)) {
            System.out.println("Error in resevation : Check-out date must be afther check-in date ");
        } else {
            Reservation reservation = new Reservation(number, checkin, chackout);
            System.out.println(reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date : ");
            checkin = sdf.parse(scan.next());
            System.out.print("Check-Out date : ");
            chackout = sdf.parse(scan.next());

            Date now = new Date();
            if (checkin.before(now) || chackout.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!chackout.after(checkin)) {
                System.out.println("Error in resevation : Check-out date must be afther check-in date ");
            }else{
                reservation.updateDates(checkin,chackout);
                System.out.println(reservation);
            }



        }
    }
}

