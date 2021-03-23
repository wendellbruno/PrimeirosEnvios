package services;

public class PaypalService implements  iOnlinePaymentService{
    private static final double PAYMENT_FEE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public Double paymentFree(Double amount) {
        return amount * PAYMENT_FEE;
    }

    @Override
    public Double interest(double amount, int months) {
        return amount * months * MONTHLY_INTEREST;
    }
}
