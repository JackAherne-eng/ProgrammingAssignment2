/**
 * The responsibility for this abstract class is to manage an Employee.
 */

public abstract class Employee {

    //-------
    //fields
    //-------
    private String firstName;
    private String secondName;
    private String ppsNumber;

    //-------
    //constructor
    //-------
    /**
     * Constructor for objects of class Employee
     * @param firstName of the Employee and sets the String to a max
     *                  of 10 characters.
     * @param secondName of the Employee and sets the String to a max
     *                   of 10 characters.
     * @param ppsNumber of the Employee and sets the String to having
     *                  the first 7 and digits and the last 2 as characters.
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

    //-------
    //methods
    //-------
    /**
     * This (abstract) method promises that any concrete subclass
     * of Employee will implement this method. This method will
     * calculate the total salary including bonuses. It will return a double.
     */
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

    /**
     * Makes sure that firstName of the Employee is
     * equals the otherEmployee.
     */
    public boolean equals(Employee otherEmployee){
        return  (this.firstName.equals(otherEmployee.getFirstName()) &&
                this.secondName.equals(otherEmployee.getSecondName())  &&
                this.ppsNumber.equals(otherEmployee.getPpsNumber()) );
    }

    //-------
    //toString
    //-------
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
