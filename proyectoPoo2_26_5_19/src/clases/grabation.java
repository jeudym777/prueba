 
package clases;
 
import java.util.ArrayList;


//// This class save the information by steps in arrays
public class grabation {
     
    int id_Depa, posX, posY;
    
    ArrayList<product> list_Product_by_Step = new ArrayList< >(); 
/// IDDEPA 
    public grabation(int id_Depa, int posX, int posY) {
        this.id_Depa = id_Depa;
        this.posX = posX;
        this.posY = posY;
    }

    public ArrayList<product> getList_Product_by_Step() {
        return list_Product_by_Step;
    }

    public void setList_Product_by_Step(ArrayList<product> list_Product_by_Step) {
        this.list_Product_by_Step = list_Product_by_Step;
    }

    
    
    
    public int getId_Depa() {
        return id_Depa;
    }

    public void setId_Depa(int id_Depa) {
        this.id_Depa = id_Depa;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
 

    public void setList_Product_vy_Step(  product  list_Product_vy_Step) {
        list_Product_by_Step.add( list_Product_vy_Step);
    }
    
    
    
}
            