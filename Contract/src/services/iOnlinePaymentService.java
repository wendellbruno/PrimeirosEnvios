package services;

public interface iOnlinePaymentService {
    Double paymentFree(Double amount);
    Double interest(double amount, int months);
}
