package model.services;


public class PaypalPaymentService implements OnlinePaymentService{

    //Taxa de pagamento
    @Override
    public Double paymentFee(double amount) {
        return amount * 0.02;
    }

    //Juros
    @Override
    public Double interest(double amount, int month){
        return amount * 0.01 * month;
    }

}
