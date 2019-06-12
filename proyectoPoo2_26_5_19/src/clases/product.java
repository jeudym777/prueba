 


package clases;

import java.util.ArrayList;

 /**

  
  */
 public class product {
    String product_Code, product_Name, product_CategoryID, product_Description, product_Date;
    boolean IVA, product_discount;
    //String product_picture;
    double priceBuy, priceSale;
    int product_Quanty ;
    double priceTotal;
     double priceTotaliva;
     String picnameProduct, product__ID_Department, URL_Product;
    public product() {
    }

    public product(String product_Code, String product_Name, String product_Category, String product_Description, String product_Date, boolean product_discount, boolean IVA, double priceBuy, double priceSale, int q) {
        this.product_Code = product_Code;
        this.product_Name = product_Name;
        this.product_CategoryID = product_Category;
        this.product_Description = product_Description;
        this.product_Date = product_Date;
        this.IVA = IVA;
        //this.product_picture = product_picture;
        this.priceBuy = priceBuy;
        this.priceSale = priceSale;
        product_Quanty = q;
        this.product_discount = product_discount;
        this.priceTotal = 0.0;
        priceTotaliva = 0.0;
        
        
        
        picnameProduct = "";

        product__ID_Department = "";
        URL_Product = "";

    }   

    public double getPriceTotaliva() {
          if (getIVA() == true) {
              double devolutionP ;
        devolutionP = getPriceSale() * 0.14;
    
        return devolutionP;
    
            
        }
           
        return priceTotaliva;
    }

    public String getPicnameProduct() {
        return picnameProduct;
    }

    public void setPicnameProduct(String picnameProduct) {
        this.picnameProduct = picnameProduct;
    }

    public String getProduct__ID_Department() {
        return product__ID_Department;
    }

    public void setProduct__ID_Department(String product__ID_Department) {
        this.product__ID_Department = product__ID_Department;
    }

    public String getURL_Product() {
        return URL_Product;
    }

    public void setURL_Product(String URL_Product) {
        this.URL_Product = URL_Product;
    }

    public void setPriceTotaliva(double priceTotaliva) {
        this.priceTotaliva = priceTotaliva;
    }

    public double getPriceTotal() {
         
        
        
        
        
        
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        
     
        
        
        this.priceTotal = priceTotal;
    }

    public int getProduct_Quanty() {
        return product_Quanty;
    }

    public void setProduct_Quanty(int product_Quanty) {
        this.product_Quanty = product_Quanty;
    }

    public boolean isProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(boolean product_discount) {
        this.product_discount = product_discount;
    }
    

    public String getProduct_Code() {
        return product_Code;
    }
    
     public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }

    public String getProduct_CategoryID() {
        return product_CategoryID;
    }

    public void setProduct_CategoryID(String product_CategoryID) {
        this.product_CategoryID = product_CategoryID;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_Category() {
        return product_CategoryID;
    }

    public void setProduct_Category(String product_Category) {
        this.product_CategoryID = product_Category;
    }

    public String getProduct_Description() {
        return product_Description;
    }

    public void setProduct_Description(String product_Description) {
        this.product_Description = product_Description;
    }

    public String getProduct_Date() {
        return product_Date;
    }

    public void setProduct_Date(String product_Date) {
        this.product_Date = product_Date;
    }



    public boolean getIVA() {
        return IVA;
    }

    public void setIVA(boolean IVA) {
        this.IVA = IVA;
    }

   /* public String getProduct_picture() {
        return product_picture;
    }

    public void setProduct_picture(String product_picture) {
        this.product_picture = product_picture;
    }
    */
    public double getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }
}

