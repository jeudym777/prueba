package clases;
 
import java.util.ArrayList;

public class bill {
    String bill_code, client_ID;
    ArrayList<product> list_productsBILL = new ArrayList<product>();

    public bill() {
    }

    public bill(String bill_code, String client_ID) {
        this.bill_code = bill_code;
        this.client_ID = client_ID;
    }

    public String getBill_code() {
        return bill_code;
    }

    public void setBill_code(String bill_code) {
        this.bill_code = bill_code;
    }

    public String getClient_Name() {
        return client_ID;
    }

    public void setClient_Name(String client_Name) {
        this.client_ID = client_Name;
    }

    public ArrayList<product> getList_productsBILL() {
        return list_productsBILL;
    }

    public void setList_productsBILL(product list_productsBILL) {
        this.list_productsBILL.add(list_productsBILL);
    }
 }
