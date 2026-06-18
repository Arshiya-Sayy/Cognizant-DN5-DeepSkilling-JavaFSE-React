public class Main {

    public static void main(String[] args) {

        PaymentProcessor payment1 =
                new PaytmAdapter();

        payment1.processPayment(5000);

        PaymentProcessor payment2 =
                new GooglePayAdapter();

        payment2.processPayment(8000);
    }
}