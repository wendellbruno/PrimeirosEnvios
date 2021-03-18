package application;


import model.entites.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number : ");
            int number = scan.nextInt();
            System.out.print("Check-in date : ");
            Date checkin = sdf.parse(scan.next());
            System.out.print("Check-Out date : ");
            Date chackout = sdf.parse(scan.next());

            Reservation reservation = new Reservation(number, checkin, chackout);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("Check-in date : ");
            checkin = sdf.parse(scan.next());
            System.out.print("Check-Out date : ");
            chackout = sdf.parse(scan.next());

            reservation.updateDates(checkin, chackout);
            System.out.println(reservation);
        }
        catch (ParseException e ){
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Erro in reservation : " + e .getMessage());
        }
        catch (RuntimeException e ){
            System.out.println("Número invalido ! ");
        }
        scan.close();

    }
}
