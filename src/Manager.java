import java.util.ArrayList;

public class Manager extends Employee{

    private ArrayList<Employee> dept;

    private int grade;

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

    public double calculateSalary() {
        double mangBonus = 0;
         for(int i = 0; i < dept.size(); i++){
             mangBonus = mangBonus + dept.get(i).calculateSalary() * 0.01;
         }
         return(Utilities.getSalaryForAdminGrade(grade) + mangBonus);
    }

    public void addDeptEmployee(Employee employee){
        dept.add(employee);
    }

    public boolean removeEmployee(int employee){
        if(Utilities.validIndex(employee, dept)){
            dept.remove(employee);
            return true;
        }
        return false;
    }

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
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(Utilities.Grade(grade)) {
            this.grade = grade;
        }
    }

    public boolean equals(Manager otherManager) {
        return super.equals(otherManager)
                && this.getGrade() == otherManager.grade;
    }

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
