import java.util.ArrayList;

public class Utilities {

    private static String numbersOnly = "[0-9]+";

    public static boolean validEmail(String email){
        if (email != null) {
            return (email.contains("@") && email.contains("."));
        }
        return false;
    }

    public static boolean onlyContainsNumbers(String text) {
        if (text != null) {
            return (text.matches(numbersOnly));
        }
        return false;
    }

    public static boolean validPPS(String pps) {
        if(pps.length()==9){
            if(pps.substring(0, 7).matches("[0-9]+")){
                if(pps.substring(7, 9).matches("[a-zA-Z]+")){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean max10Chars(String string){
        return (string.length()<=10) ? true : false;
    }

    public static boolean max30Chars(String string){
        return (string.length()<=30) ? true : false;
    }

    public static boolean validIntRange(int one, int two, int three){
        return three >= one && three <= two;
    }

    public static boolean validLecturerLevel(int lecLevel){
        if(validIntRange(1,3,lecLevel)){
            return true;
        }
        return false;
    }

    public static boolean validMangerLevel(int mangLevel){
        if(validIntRange(1,7,mangLevel)){
            return true;
        }
        return false;
    }

    public static boolean validAdminLevel(int adminLevel){
        if(validIntRange(1,4,adminLevel)){
            return true;
        }
        return false;
    }

    public static boolean validIntNonNegative(int nonNeg){
        return nonNeg >= 0;
    }

    public static boolean validDoubleNonNegative(int doubNonNeg){
        return doubNonNeg >= 0;
    }


    public static boolean validIndex(int index, ArrayList arrayList){
        return index >= 0 && index < arrayList.size();
    }

    public static boolean Grade(int grade){
        if(validIntRange(1,7,grade)){
            return true;
        }
        return false;
    }

    public static double getSalaryForLecturerLevel(int salary){
        if(validIntRange(1,3,salary)){
            return salary*1000;
        }
        return 0;
    }

    public static double getSalaryForAdminGrade(int salaryGrade){
        if(validIntRange(1,7,salaryGrade)){
            return salaryGrade*700;
        }
        return 0;
    }

}