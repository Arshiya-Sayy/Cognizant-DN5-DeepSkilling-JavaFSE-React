public class CustomerRepoImpl
        implements CustomerRepo {

    public String findCustomerById(
            int id) {

        return "Customer Id: " + id;
    }
}