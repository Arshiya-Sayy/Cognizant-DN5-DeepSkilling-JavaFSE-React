public class Main {

    public static void main(String[] args) {

        // Unsorted Array for Linear Search

        Book[] books = {

                new Book(
                        101,
                        "Java Programming",
                        "James Gosling"),

                new Book(
                        102,
                        "Python Basics",
                        "Guido van Rossum"),

                new Book(
                        103,
                        "Data Structures",
                        "Mark Allen"),

                new Book(
                        104,
                        "C++ Fundamentals",
                        "Bjarne Stroustrup")
        };

        System.out.println(
                "===== Linear Search =====");

        Book result1 =
                SearchOperations.linearSearch(
                        books,
                        "Data Structures");

        if(result1 != null) {

            System.out.println(
                    "Book Found");

            System.out.println(result1);
        }
        else {

            System.out.println(
                    "Book Not Found");
        }

        // Sorted Array for Binary Search

        Book[] sortedBooks = {

                new Book(
                        104,
                        "C++ Fundamentals",
                        "Bjarne Stroustrup"),

                new Book(
                        103,
                        "Data Structures",
                        "Mark Allen"),

                new Book(
                        101,
                        "Java Programming",
                        "James Gosling"),

                new Book(
                        102,
                        "Python Basics",
                        "Guido van Rossum")
        };

        System.out.println(
                "\n===== Binary Search =====");

        Book result2 =
                SearchOperations.binarySearch(
                        sortedBooks,
                        "Java Programming");

        if(result2 != null) {

            System.out.println(
                    "Book Found");

            System.out.println(result2);
        }
        else {

            System.out.println(
                    "Book Not Found");
        }
    }
}