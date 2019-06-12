/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoy_modePAy;

import clases.grabation;
import clases.product;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public abstract class Bill_General {
    
    String id ,iddClient,nameClient, day, month, year, type;

    int total_perIva;
    
        ArrayList<product> list_productsBILL = new ArrayList<product>();

        ArrayList<grabation> list_steps = new ArrayList<>();
        
        
        
    public Bill_General() {
    }

    public Bill_General(String id,String idC, String nameClient, String day, String month, String year) {
        this.id = id;
       iddClient = idC;

        this.nameClient = nameClient;
        this.day = day;
        this.month = month;
        this.year = year;
        this.type = "";
        this.total_perIva = 0;
        
    }

    public int getTotal_perIva() {
        return total_perIva;
    }

    public void setTotal_perIva(int total_perIva) {
        this.total_perIva = total_perIva;
    }

    
    
    
    
    public ArrayList<product> getList_productsBILL() {
        return list_productsBILL;
    }

    public void setList_productsBILL(product list_productsBILL) {
        
        this.list_productsBILL.add(list_productsBILL);
        
    }

    public ArrayList<grabation> getList_steps() {
        return list_steps;
    }

    public void setList_steps(grabation list_steps) {
        this.list_steps.add(list_steps);
    }

    public String getIddClient() {
        return iddClient;
    }

    public void setIddClient(String iddClient) {
        this.iddClient = iddClient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
    
    
    
    
}
