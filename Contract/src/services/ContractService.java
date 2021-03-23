package services;


import entites.Contract;
import entites.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private iOnlinePaymentService onlinePaymentService;

    public ContractService(iOnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;

    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months ; i++) {
              double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota,i);
              double fullQuota= updateQuota + onlinePaymentService.paymentFree(updateQuota);
              Date dueDate = addMonths(contract.getDate(),i);
              contract.getInstallments().add(new Installment(dueDate,fullQuota));
        }
    }
    private Date addMonths(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,n);
        return calendar.getTime();
    }
}
