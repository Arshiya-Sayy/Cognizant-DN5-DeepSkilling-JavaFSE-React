public class Main {

    public static void main(String[] args) {

        CustomerRepo repository =
                new CustomerRepoImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);
    }
}