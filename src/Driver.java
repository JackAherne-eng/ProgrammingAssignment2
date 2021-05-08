///**
// *  This is the Driver class which has the responsibility to run the app and perform I/O with the user
// */
//public class Driver {
//
//    /**
//     *  This builds the interface for the user
//     */
//private int mainMenu() {
//        System.out.println("Employee Menu");
//        System.out.println("---------");
//        System.out.println("  1)  Add an employee (Manager)");
//        System.out.println("  2)  Add an employee (Lecturer)");
//        System.out.println("  3)  Add an employee (Admin Worker)");
//        System.out.println("  4)  Add an existing employee to a department");
//        System.out.println("  5)  Delete an employee");
//        System.out.println("---------");
//        System.out.println("  6)  Add a department to a school");
//        System.out.println("  7)  Delete a department from a school");
//        System.out.println("  8)  Find the name of the manager of a given department");
//        System.out.println("  9)  List all the employees in a given department");
//        System.out.println("---------");
//        System.out.println("  10)  Find the salary of a given employee");
//        System.out.println("  11)  Find the total of the salaries owed to all the employees");
//        System.out.println("  12)  Find the average of the salaries owed to all the employees");
//        System.out.println("  13)  Print the employee with the highest pay");
//        System.out.println("---------");
//        System.out.println("  14)  List all the employees in the company in ascending alphabetical order (first name)");
//        System.out.println("  15)  List all the employees in the company in ascending alphabetical order (second name)");
//        System.out.println("---------");
//        System.out.println("  16)  Search the system for an employee by second name");
//        System.out.println("  17)  Search the system for an employee within a given managers department");
//        System.out.println("---------");
//        System.out.println("   18)  Save to XML");
//        System.out.println("   19)  Load from XML");
//        System.out.println("---------");
//        System.out.println("   0)  Exit");
//        return ScannerInput.validNextInt("==>> ");
//        }
//private void runMenu() {
//    int option = mainMenu();
//    while (option != 0) {
//
//        switch (option) {
//
//            default:
//                System.out.println("");
//                break;
//        }
//        System.out.println("\nPress any key to continue...");
//        input.nextLine();
//
//        option = mainMenu();
//    }
//    System.out.println("Exiting program...");
//    System.exit(0);
//    }
//    //-------
//    //fields
//    //-------
//
//
//    //-------
//    //constructor
//    //-------
//    public Driver() {
//        empAPI = new EmployeeAPI();
//        school = new School("Science and Computing"); //setting up school as our own!
//    }
//
//    //-------
//    //methods
//    //-------
//    Driver app = new Driver();
//    app.run();
//}
