/**
 * imports the ArrayList utility
 */
import java.util.ArrayList;

/**
 * The responsibility for this concrete class is to extend Employee and implement the class for a Manager class
 */
public class Manager extends Employee{

    private ArrayList<Employee> dept;
    private int grade;

    /**
     * Constructor for objects of class Employee
     * @param grade constructs the grade of wage for the Manager
     *              and if the Grade isn't valid (using Grade)
     *              it sets the default value to 1.
     */
    public Manager(String firstName, String secondName, String ppsNumber, int grade) {
        super(firstName, secondName, ppsNumber);

        if(Utilities.Grade(grade)){
            this.grade = grade;
        }
        else{
            this.grade = 1;
        }

        this.dept = new ArrayList<Employee>();
    }

    /**
     * Using a method from Assignment 1 called "noOfNationalPlayersByClub"
     * I used the basis for this to calculated the dept size and multiplying this by
     * 0.01. this equals the mangBonus which is added to the grade.
     * then returns the salary for the AdminWorker by using the grade we constructed.
     */
    public double calculateSalary() {
        double mangBonus = 0;
         for(int i = 0; i < dept.size(); i++){
             mangBonus = mangBonus + dept.get(i).calculateSalary() * 0.01;
         }
         return(Utilities.getSalaryForAdminGrade(grade) + mangBonus);
    }

    /**
     * This adds an employee to the dept
     */
    public void addDeptEmployee(Employee employee){
        dept.add(employee);
    }

    /**
     * This removes an employee from the dept if the index of the
     * employee is valid using validIndex.
     */
    public boolean removeEmployee(int employee){
        if(Utilities.validIndex(employee, dept)){
            dept.remove(employee);
            return true;
        }
        return false;
    }

    /**
     * This returns the size of the dept.
     */
    public int numberInDept(){
        return dept.size();
    }

    //-------
    //getters
    //-------

    public ArrayList<Employee> getDept() {
        return dept;
    }

    public void setDept(ArrayList<Employee> dept) {
        this.dept = dept;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the grade to the value passed as a parameter
     * @param grade To the new level.
     */
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(Utilities.Grade(grade)) {
            this.grade = grade;
        }
    }

    /**
     * Using the super equals from the Employee class,
     * while also checking that grade equals otherManager.
     */
    public boolean equals(Manager otherManager) {
        return super.equals(otherManager)
                && this.getGrade() == otherManager.grade;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific users dept and grade of pay.
     *         While also displaying no employees if the dept is empty.
     */
    public String toString() {
        if(!dept.isEmpty()){
        return "Manager{" +
                "dept=" + dept +
                ", grade=" + grade +
                "} " + super.toString();
        }
       else{
           return "no employees" + super.toString();
        }
    }
}
