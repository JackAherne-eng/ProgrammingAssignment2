/**
 * imports the ArrayList utility
 */
import java.util.ArrayList;

/**
 * The responsibility for the class was to store the reusable Utility methods in one area.
 */
public class Utilities {

    /**
     * numbersOnly will set something to only contain numbers
     */
    private static String numbersOnly = "[0-9]+";

    /**
     * validEmail validates if the email contains
     * and '@' and '.' symbols, else it returns false
     */
    public static boolean validEmail(String email){
        if (email != null) {
            return (email.contains("@") && email.contains("."));
        }
        return false;
    }

    /**
     * onlyContainsNumbers sets a string to only contain
     * numbers.
     */
    public static boolean onlyContainsNumbers(String text) {
        if (text != null) {
            return (text.matches(numbersOnly));
        }
        return false;
    }

    /**
     * validPPS validates if the PPS number contains
     * numbers within the first 7 characters and 2 letters
     * at the end.
     */
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

    /**
     * Sets a string to have a max length of 10
     */
    public static boolean max10Chars(String string){
        return (string.length()<=10) ? true : false;
    }

    /**
     * Sets a string to have a max length of 30
     */
    public static boolean max30Chars(String string){
        return (string.length()<=30) ? true : false;
    }

    /**
     * validIntRange validates the int three is within the boundaries
     * set by int one and int two.
     */
    public static boolean validIntRange(int one, int two, int three){
        return three >= one && three <= two;
    }

    /**
     * validLecturerLevel validates the int lecLevel is within the boundaries
     * of number 1 and 3. It uses the utility validIntRange.
     */
    public static boolean validLecturerLevel(int lecLevel){
        if(validIntRange(1,3,lecLevel)){
            return true;
        }
        return false;
    }

    /**
     * validMangerLevel validates the int mangLevel is within the boundaries
     * of number 1 and 7. It uses the utility validIntRange.
     */
    public static boolean validMangerLevel(int mangLevel){
        if(validIntRange(1,7,mangLevel)){
            return true;
        }
        return false;
    }

    /**
     * validAdminLevel validates the int adminLevel is within the boundaries
     * of number 1 and 4. It uses the utility validIntRange.
     */
    public static boolean validAdminLevel(int adminLevel){
        if(validIntRange(1,4,adminLevel)){
            return true;
        }
        return false;
    }

    /**
     * validIntNonNegative validates that nonNeg is equal or greater than 0.
     */
    public static boolean validIntNonNegative(int nonNeg){
        return nonNeg >= 0;
    }

    /**
     * validDoubleNonNegative validates that doubNonNeg is equal or greater than 0.
     */
    public static boolean validDoubleNonNegative(int doubNonNeg){
        return doubNonNeg >= 0;
    }

    /**
     * validIndex validates that the index is equal or greater than 0
     * and less that the size of the ArrayList.
     */
    public static boolean validIndex(int index, ArrayList arrayList){
        return index >= 0 && index < arrayList.size();
    }

    /**
     * grade sets the int is within the boundaries
     * of number 1 and 7. It uses the utility validIntRange.
     */
    public static boolean Grade(int grade){
        if(validIntRange(1,7,grade)){
            return true;
        }
        return false;
    }

    /**
     * getSalaryForLecturerLevel sets the int is within the boundaries
     * of number 1 and 3. It uses the utility validIntRange and multiplies
     * salary by 1000.
     */
    public static double getSalaryForLecturerLevel(int salary){
        if(validIntRange(1,3,salary)){
            return salary*1000;
        }
        return 0;
    }

    /**
     * getSalaryForAdminGrade sets the int is within the boundaries
     * of number 1 and 7. It uses the utility validIntRange and multiplies
     * salaryGrade by 700.
     */
    public static double getSalaryForAdminGrade(int salaryGrade){
        if(validIntRange(1,7,salaryGrade)){
            return salaryGrade*700;
        }
        return 0;
    }

}