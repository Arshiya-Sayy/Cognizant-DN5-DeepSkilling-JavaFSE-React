public class Main {

    public static void main(String[] args) {

        // Array for Linear Search

        Product[] products = {

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        102,
                        "Mouse",
                        "Electronics"),

                new Product(
                        103,
                        "Keyboard",
                        "Electronics"),

                new Product(
                        104,
                        "Monitor",
                        "Electronics"),

                new Product(
                        105,
                        "Printer",
                        "Electronics")
        };

        System.out.println(
                "===== Linear Search =====");

        Product result1 =
                SearchOperation.linearSearch(
                        products,
                        "Monitor");

        if(result1 != null) {

            System.out.println(
                    "Product Found");

            System.out.println(result1);
        }
        else {

            System.out.println(
                    "Product Not Found");
        }

        // Sorted Array for Binary Search

        Product[] sortedProducts = {

                new Product(
                        103,
                        "Keyboard",
                        "Electronics"),

                new Product(
                        101,
                        "Laptop",
                        "Electronics"),

                new Product(
                        104,
                        "Monitor",
                        "Electronics"),

                new Product(
                        102,
                        "Mouse",
                        "Electronics"),

                new Product(
                        105,
                        "Printer",
                        "Electronics")
        };

        System.out.println(
                "\n===== Binary Search =====");

        Product result2 =
                SearchOperation.binarySearch(
                        sortedProducts,
                        "Monitor");

        if(result2 != null) {

            System.out.println(
                    "Product Found");

            System.out.println(result2);
        }
        else {

            System.out.println(
                    "Product Not Found");
        }
    }
}