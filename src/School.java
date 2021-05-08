import java.util.HashMap;

public class School {

    // Used to map key words to responses.
    private HashMap<String, Manager> departments;

    private String name;

    public School(String name)
    {
        if (Utilities.max30Chars(name)) {
            this.name = name;
        } else {
            this.name = name.substring(0, 30);
        }

        this.departments = new HashMap<String, Manager>();
    }

    public Manager getManager(String getMang){
        for(int i; ){
            if(getMang =)
        }
    }

}

