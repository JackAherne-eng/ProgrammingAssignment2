/**
 * The responsibility for this abstract class is to manage an Employee.
 */

public abstract class Employee {

    private String firstName;
    private String secondName;
    private String ppsNumber;

    /**
     * Constructor for objects of class Employee
     * @param firstName of the Employee
     * @param secondName of the Employee
     * @param ppsNumber of the Employee
     */
    public Employee(String firstName, String secondName, String ppsNumber)
    {
        if (Utilities.max10Chars(firstName)) {
            this.firstName = firstName;
        } else {
            this.firstName = firstName.substring(0, 10);
        }

        if (Utilities.max10Chars(secondName)) {
            this.secondName = secondName;
        } else {
            this.secondName = secondName.substring(0, 10);
        }

        if (Utilities.validPPS(ppsNumber)) {
            this.ppsNumber = ppsNumber;
        } else {
            this.ppsNumber = "0000000XX";
        }
    }

    public abstract double calculateSalary();

    //-------
    //getters
    //-------
    /**
     * Returns the First name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the Second name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Returns the pps number
     */
    public String getPpsNumber() {
        return ppsNumber;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the Second Name to the value passed as a parameter
     * @param secondName The new Second Name
     */
    public void setSecondName(String secondName) {
        if (Utilities.max10Chars(secondName)) {
            this.secondName = secondName;
        }
    }

    /**
     * Updates the first Name to the value passed as a parameter
     * @param firstName The new First Name
     */
    public void setFirstName(String firstName) {
        if (Utilities.max10Chars(firstName)) {
            this.firstName = firstName;
        }
    }

    /**
     * Updates the pps Number to the value passed as a parameter
     * @param ppsNumber The new pps number
     */
    public void setPpsNumber(String ppsNumber) {
        if (Utilities.validPPS(ppsNumber)) {
            this.ppsNumber = ppsNumber;
        }
    }

    public boolean equals(Employee otherEmployee){
        return  (this.firstName.equals(otherEmployee.getFirstName()) &&
                this.secondName.equals(otherEmployee.getSecondName())  &&
                this.ppsNumber.equals(otherEmployee.getPpsNumber()) );
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific users name and pps number
     */
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", ppsNumber='" + ppsNumber + '\'' +
                '}';
    }
}
