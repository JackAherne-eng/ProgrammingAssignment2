/**
 * The responsibility for this concrete class is to extend Employee and implement the class for a Lecturer.
 */
 public class Lecturer extends Employee {

    //-------
    //fields
    //-------
    private int level;

    //-------
    //constructor
    //-------
    /**
     * Constructor for objects of class Lecturer
     * @param level constructs the level of wage for the lecturer
     *              and if the level isn't valid (using validLecturerLevel)
     *              it sets the default value to 1.
     */
    public Lecturer(String firstName, String secondName, String ppsNumber, int level) {
        super(firstName, secondName, ppsNumber);

        if (Utilities.validLecturerLevel(level)) {
            this.level = level;
        } else {
            this.level = 1;
        }

    }

    //-------
    //methods
    //-------
    /**
     * calculates the salary for the Lecturer by using the level we constructed.
     */
    public double calculateSalary() {
        return Utilities.getSalaryForLecturerLevel(level);
    }

    //-------
    //getters
    //-------
    /**
     * Returns the First name
     */
    public int getLevel() {
        return level;
    }

    //-------
    //setters
    //-------
    /**
     * Updates the level to the value passed as a parameter
     * @param level To the new level.
     */
    public void setLevel(int level) {
        if (Utilities.validLecturerLevel(level)) {
            this.level = level;
        }
    }

    /**
     * Using the super equals from the Employee class,
     * while also checking that level equals otherLecturer
     */
    public boolean equals(Lecturer otherLecturer) {
        return super.equals(otherLecturer)
                && this.getLevel() == otherLecturer.level;

    }

    //-------
    //toString
    //-------
    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific users level.
     */
    public String toString() {
        return "Lecturer{" +
                "level=" + level +
                "} " + super.toString();
    }
}
