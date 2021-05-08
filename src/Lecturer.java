public class Lecturer extends Employee {

    private int level;

    public Lecturer(String firstName, String secondName, String ppsNumber, int level) {
        super(firstName, secondName, ppsNumber);

        if (Utilities.validLecturerLevel(level)) {
            this.level = level;
        } else {
            this.level = 1;
        }

    }

    public double calculateSalary() {
        return Utilities.getSalaryForLecturerLevel(level);
    }

    //-------
    //getters
    //-------
    public int getGrade() {
        return level;
    }

    //-------
    //setters
    //-------
    public void setLevel(int level) {
        if (Utilities.validLecturerLevel(level)) {
            this.level = level;
        }
    }

    public boolean equals(Lecturer otherLecturer) {
        return super.equals(otherLecturer)
                && this.getGrade() == otherLecturer.level;

    }

    public String toString() {
        return "Lecturer{" +
                "level=" + level +
                "} " + super.toString();
    }
}
