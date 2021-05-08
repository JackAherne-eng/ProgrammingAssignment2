/**
 * imports the ArrayList utility
 */
import java.util.ArrayList;

/**
 * This API class is responsible for storing and managing ALL the employees in the system
 */
public class EmployeeAPI {

    private ArrayList<Employee> employees;

    /**
     * Constructor for objects of class Manager
     * instantiates the employees ArrayList.
     */
    public EmployeeAPI() {

        this.employees = new ArrayList<Employee>();
    }

    //-------
    //getters
    //-------
    /**
     * Returns the employee ArrayList
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the employees to the value passed as a parameter
     * @param employees To the new employees.
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    //-------
    //methods
    //-------


    //-------
    //toString
    //-------
    /**
     * Incomplete toString of the EmployeeAPI class
     */
    public String toString() {
        return "EmployeeAPI{" +
                "employees=" + employees +
                '}';
    }
}
