public class CustomerService {

    private CustomerRepo repository;

    public CustomerService(
            CustomerRepo repository) {

        this.repository = repository;
    }

    public void getCustomer(
            int id) {

        System.out.println(
                repository.findCustomerById(id));
    }
}