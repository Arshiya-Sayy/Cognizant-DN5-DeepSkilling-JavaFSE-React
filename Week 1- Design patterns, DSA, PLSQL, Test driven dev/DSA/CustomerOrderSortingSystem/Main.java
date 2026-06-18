public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(
                        101,
                        "Arshiya",
                        5000),

                new Order(
                        102,
                        "Aisha",
                        2500),

                new Order(
                        103,
                        "Fatima",
                        9000),

                new Order(
                        104,
                        "Sara",
                        4500)
        };

        System.out.println(
                "===== Original Orders =====");

        SortingOperations.displayOrders(
                orders);

        // Bubble Sort

        Order[] bubbleOrders =
                orders.clone();

        SortingOperations.bubbleSort(
                bubbleOrders);

        System.out.println(
                "\n===== Bubble Sort =====");

        SortingOperations.displayOrders(
                bubbleOrders);

        // Quick Sort

        Order[] quickOrders =
                orders.clone();

        SortingOperations.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1);

        System.out.println(
                "\n===== Quick Sort =====");

        SortingOperations.displayOrders(
                quickOrders);
    }
}