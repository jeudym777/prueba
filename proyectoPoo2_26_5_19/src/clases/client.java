 
package clases;
 
import factoy_modePAy.Bill_General;
import java.util.ArrayList;

public class client   {

    String idCliente, nameClient, emailClient, category_Client;

    double totalivaPAY;
    
    
    ArrayList<Bill_General> list_billClient = new ArrayList<>();
   
    
    public client() {
    }

    public client(String idCliente, String nameClient, String emailClient, String category_Client) {
        this.idCliente = idCliente;
        this.nameClient = nameClient;
        this.emailClient = emailClient;
        this.category_Client = category_Client;
        totalivaPAY = 0;
        
    }

    public double getTotalivaPAY() {
        return totalivaPAY;
    }

    public void setTotalivaPAY(double totalivaPAY) {
        this.totalivaPAY = totalivaPAY;
    }

    public ArrayList<Bill_General> getList_billClient() {
        return list_billClient;
    }

    public void setList_billClient(Bill_General x) {
        this.list_billClient.add(x);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getCategory_Client() {
        return category_Client;
    }

    public void setCategory_Client(String category_Client) {
        this.category_Client = category_Client;
    }

    




}