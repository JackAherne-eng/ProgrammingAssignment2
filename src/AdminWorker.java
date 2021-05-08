/**
 * The responsibility for this concrete class is to extend Employee and implement the class for an AdminWorker.
 */
public class AdminWorker extends Employee{

    private static final float FIXED_BONUS = 200;
    private int grade;

    /**
     * Constructor for objects of class AdminWorker
     * @param grade constructs the grade of wage for the AdminWorker
     *              and if the Grade isn't valid (using Grade)
     *              it sets the default value to 1.
     */
    public AdminWorker(String firstName, String secondName, String ppsNumber, int grade) {
        super(firstName, secondName, ppsNumber);

        if(Utilities.Grade(grade)){
            this.grade = grade;
        }
        else{
            this.grade = 1;
        }
    }

    //-------
    //methods
    //-------
    /**
     * calculates the salary for the AdminWorker by using the grade we constructed
     * with an addition of the FIXED_BONUS.
     */
    public double calculateSalary() {
        return Utilities.getSalaryForAdminGrade(grade) + FIXED_BONUS;
    }

    //-------
    //getters
    //-------
    /**
     * Returns the First name
     */
    public int getGrade() {
        return grade;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the grade to the value passed as a parameter
     * @param grade To the new level.
     */
    public void setGrade(int grade) {
        if(Utilities.Grade(grade)) {
            this.grade = grade;
        }
    }

    /**
     * Using the super equals from the Employee class,
     * while also checking that grade equals otherAdminWorker
     */
    public boolean equals(AdminWorker otherAdminWorker) {
        return super.equals(otherAdminWorker)
                && this.getGrade() == otherAdminWorker.grade;
    }

    //-------
    //toString
    //-------
    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific users grade.
     */
    public String toString() {
        return "AdminWorker{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
