 
package clases;

import java.util.ArrayList;
import java.util.Locale;

public class departament {
    String departament_code, departament_description;
    
    ArrayList< products_Categories > list_categories = new ArrayList<products_Categories>();


    public departament() {
    }

    public departament(String departament_code, String departament_description) {
        this.departament_code = departament_code;
        this.departament_description = departament_description;
    }

    public ArrayList<products_Categories> getList_categories() {
        return list_categories;
    }

    public void setList_categories( products_Categories list_categories) {
        this.list_categories.add(list_categories) ;
    }

    public String getDepartament_code() {
        return departament_code;
    }

    public void setDepartament_code(String departament_code) {
        this.departament_code = departament_code;
    }

    public String getDepartament_description() {
        return departament_description;
    }

    public void setDepartament_description(String departament_description) {
        this.departament_description = departament_description;
    }


}
