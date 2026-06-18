public class GooglePayAdapter
        implements PaymentProcessor {

    private GooglePayGateway gpay;

    public GooglePayAdapter() {

        gpay = new GooglePayGateway();
    }

    @Override
    public void processPayment(double amount) {

        gpay.sendMoney(amount);
    }
}