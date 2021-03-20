package model.services;

import model.entites.CarRental;
import model.entites.Invoice;

import java.net.CacheRequest;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private iTaxService taxService;

    double basicPayment;

    public RentalService() {
    }

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    public void processInvoice(CarRental carRental){
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();

        double hours = (double) (t2 - t1)/ 1000 / 60 / 60;
        if(hours <= 12 ){
            basicPayment = Math.ceil(hours) * pricePerHour;
        }else{
            basicPayment = Math.ceil(hours/24) * pricePerDay;
        }
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
