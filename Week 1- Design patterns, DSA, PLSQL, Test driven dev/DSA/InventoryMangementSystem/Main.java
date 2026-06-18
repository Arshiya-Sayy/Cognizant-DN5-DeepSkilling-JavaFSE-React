public class Main {

    public static void main(String[] args) {

        Inventory inventory =
                new Inventory();

        inventory.addProduct(
                new Product(
                        1,
                        "Laptop",
                        10,
                        50000));

        inventory.addProduct(
                new Product(
                        2,
                        "Mouse",
                        50,
                        500));

        inventory.displayInventory();

        inventory.updateProduct(
                1,
                15,
                55000);

        inventory.deleteProduct(2);

        System.out.println(
                "\nFinal Inventory:");

        inventory.displayInventory();
    }
}