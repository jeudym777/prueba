/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoy_modePAy;

import clases.product;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PayCash  extends Bill_General {

    public PayCash() {
    }

    public PayCash(String id, String idc, String nameClient, String day, String month, String year) {
        super(id,idc, nameClient, day, month, year);
    }

    @Override
    public void setType(String type) {
        super.setType("Cash "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYear(String year) {
        super.setYear(year); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getYear() {
        return super.getYear(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMonth(String month) {
        super.setMonth(month); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMonth() {
        return super.getMonth(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDay(String day) {
        super.setDay(day); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDay() {
        return super.getDay(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNameClient(String nameClient) {
        super.setNameClient(nameClient); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameClient() {
        return super.getNameClient(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return super.getType(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIddClient(String iddClient) {
        super.setIddClient(iddClient); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIddClient() {
        return super.getIddClient(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setList_productsBILL(product list_productsBILL) {
        super.setList_productsBILL(list_productsBILL); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<product> getList_productsBILL() {
        return super.getList_productsBILL(); //To change body of generated methods, choose Tools | Templates.
    }
}
