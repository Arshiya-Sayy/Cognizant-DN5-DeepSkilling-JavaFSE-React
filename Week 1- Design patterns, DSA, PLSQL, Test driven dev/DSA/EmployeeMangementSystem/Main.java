public class Main {

    public static void main(String[] args) {

        EmployeeManagement system =
                new EmployeeManagement(10);

        system.addEmployee(
                new Employee(
                        101,
                        "Arshiya",
                        "Software Engineer",
                        50000));

        system.addEmployee(
                new Employee(
                        102,
                        "Aisha",
                        "Data Analyst",
                        60000));

        system.addEmployee(
                new Employee(
                        103,
                        "Fatima",
                        "Manager",
                        80000));

        System.out.println(
                "\n===== Employee Records =====");

        system.traverseEmployees();

        System.out.println(
                "\n===== Search Employee =====");

        Employee employee =
                system.searchEmployee(102);

        if(employee != null) {

            System.out.println(
                    employee);
        }
        else {

            System.out.println(
                    "Employee Not Found");
        }

        System.out.println(
                "\n===== Delete Employee =====");

        system.deleteEmployee(102);

        System.out.println(
                "\n===== Employee Records After Deletion =====");

        system.traverseEmployees();
    }
}