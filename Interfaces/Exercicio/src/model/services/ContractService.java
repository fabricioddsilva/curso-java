package model.services;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {

    private OnlinePaymentService service = new PaypalPaymentService();

    public void processContract(Contract contract, int months){
        double monthValue = contract.getTotalValue() / months;
        for(int i = 0; i < months; i++){
            double interest = monthValue + service.interest(monthValue, i+1);
            double parcel = interest + service.paymentFee(interest);
            contract.setInstallments(new Installments(contract.getDate().plusMonths(i+1), parcel));
        }
    }
}
