public class AdminWorker extends Employee{

    private static final float FIXED_BONUS = 200;

    private int grade;

    public AdminWorker(String firstName, String secondName, String ppsNumber, int grade) {
        super(firstName, secondName, ppsNumber);

        if(Utilities.Grade(grade)){
            this.grade = grade;
        }
        else{
            this.grade = 1;
        }
    }

    public double calculateSalary() {
        return Utilities.getSalaryForAdminGrade(grade) + FIXED_BONUS;
    }

    //-------
    //getters
    //-------
    public int getGrade() {
        return grade;
    }

    //-------
    //setters
    //-------
    public void setGrade(int grade) {
        if(Utilities.Grade(grade)) {
            this.grade = grade;
        }
    }

    public boolean equals(AdminWorker otherAdminWorker) {
        return super.equals(otherAdminWorker)
                && this.getGrade() == otherAdminWorker.grade;
    }

    public String toString() {
        return "AdminWorker{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
