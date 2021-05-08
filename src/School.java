///**
// * imports the HashMap utility
// */
//import java.util.HashMap;
//
///**
// * The responsibility for this class is to manage a School.
// *  A school can have any number of departments, each with a Manager.
// *  For example, in WIT, the School of Science and Computing has two
// *  departments, each with it's own manager.
// */
//
//public class School {
//
//    //-------
//    //fields
//    //-------
//    // Used to map key words to responses.
//    private HashMap<String, Manager> departments;
//    private String name;
//
//    //-------
//    //constructor
//    //-------
//    /**
//     * Constructor for objects of class school
//     * @param name of the school and sets the String to a max
//     *                  of 30 characters.
//     */
//    public School(String name)
//    {
//        if (Utilities.max30Chars(name)) {
//            this.name = name;
//        } else {
//            this.name = name.substring(0, 30);
//        }
//
//        this.departments = new HashMap<String, Manager>();
//    }
//
//    //-------
//    //getters
//    //-------
//    /**
//     * Returns the departments Hashmap
//     */
//    public HashMap<String, Manager> getDepartments() {
//        return departments;
//    }
//
//    /**
//     * Returns the name
//     */
//    public String getName() {
//        return name;
//    }
//
//    //-------
//    //setters
//    //-------
//    /**
//     * Updates the departments to the value passed as a parameter
//     * @param departments To the new departments.
//     */
//    public void setDepartments(HashMap<String, Manager> departments) {
//        this.departments = departments;
//    }
//    /**
//     * Updates the name to the value passed as a parameter
//     * @param name To the new name.
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //-------
//    //methods
//    //-------
//    public Manager getManager(String getMang){
//        for(int i; ){
//            if(getMang =)
//        }
//    }
//
//    //-------
//    //toString
//    //-------
//    /**
//     * Incomplete toString of the school class
//     */
//    public String toString() {
//        return "School{" +
//                "departments=" + departments +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

