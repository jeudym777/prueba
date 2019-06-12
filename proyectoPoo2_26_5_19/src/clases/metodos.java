 
package clases;
 
import clases.bill;
import clases.client;
import clases.departament;
import clases.product;
import clases.products_Categories;
import factoy_modePAy.Bill_General;
import factoy_modePAy.Factory_Bills;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;

import javax.swing.JTextField;


public class metodos {
    

    public static ArrayList<client> list_clients = new ArrayList<>();

    public static ArrayList<bill> list_Bills = new ArrayList<bill>();
    
    public static ArrayList<JTextField> list_EmptyValidation = new ArrayList<JTextField>();
    
    public static ArrayList<products_Categories> list_inventory = new ArrayList<products_Categories>();
    
    public static ArrayList<product> list_product_D1 = new ArrayList<product>();
    
    public static ArrayList<product> list_product_General = new ArrayList< >();

    
    public static ArrayList<product> list_product_D2 = new ArrayList<product>();
    
    
    
    public static ArrayList<product> list_product_D3 = new ArrayList<product>();
    
    
    
    
    public static ArrayList<product> list_product_D4 = new ArrayList<product>();
    
    
    
    public static ArrayList<product> list_product_D5 = new ArrayList<product>();
    
    
    public static ArrayList<product> list_product_D6 = new ArrayList<product>();
    
    public static ArrayList<Bill_General> list_BillsGeneral = new ArrayList<Bill_General>();

    
    
    public static ArrayList<departament> list_department = new ArrayList<departament>();
    
    public static Boolean user_type = true;

    public static String idG, passG;
    

    
    public static metodos instance = null;
    
    

    public  static DefaultListModel modelo = new DefaultListModel();

    

    public static ArrayList<departament> getList_department() {
        return list_department;
    }

    public static void setList_department(departament list_department) {
        metodos.list_department.add(list_department);
    }
    
    
    
    
    
 
    public static metodos getInstance(){
    
        if (instance == null) {
            instance = new metodos();
            return instance;
        }
        return instance;
    }

        product p = new product("1p", "Leche sabemas", "lc", "Leche semidescremada en polvo",
                "15/12/2018", false, true, 2800, 3500, 25);

        product p1 = new product("2p", "Leche Pinito Dos pinos", "lc", "Leche semidescremada en polvo",
                "15/12/2018", true, false, 2800, 3500, 50);

        product p2 = new product("3p", "Leche en polvo Coronado", "lc", "Leche semidescremada en polvo",
                "15/12/2018", false, false, 2800, 3500, 10000);
        product p5 = new product("5p", "Leche Condensada", "lc", "Leche semidescremada en polvo",
                "15/12/2018", true, true, 2800, 3500, 800);

        
        product p6 = new product("1p", "Azucar morena", "lc", "Endulzante",
                "15/12/2018", false, true, 500, 3500, 25);

        product p7 = new product("2p", "Azucar BLANCA", "lc", "Endulzante",
                "15/12/2018", true, true, 1000, 3500, 50);

        product p8 = new product("3p", "Azucar extra fina", "lc"," Endulzante",
                "15/12/2018", true, true, 1900, 3500, 10000);
        product p9 = new product("5p", "Leche Condensada", "lc", "Leche semidescremada en polvo",
                "15/12/2018", true, true, 2800, 3500, 800);
        
        
        
        
        
        
    public DefaultListModel get_Depa1Products() {

        DefaultListModel model_Aux = new DefaultListModel();

        model_Aux.addElement(p.getProduct_Name());
        model_Aux.addElement(p1.getProduct_Name());
        model_Aux.addElement(p2.getProduct_Name());
        model_Aux.addElement(p5.getProduct_Name());

        return model_Aux;

    }

    
    
    
    
    public DefaultListModel get_Depa2Products() {

        DefaultListModel model_Aux = new DefaultListModel();



        model_Aux.addElement(p6.getProduct_Name());
        model_Aux.addElement(p7.getProduct_Name());
        model_Aux.addElement(p8.getProduct_Name());
        model_Aux.addElement(p9.getProduct_Name());

        return model_Aux;

    }


    
    
    
    
    
    
    
        product p10 = new product("1p", "Jabon en polvo ", "lc", "Producto de limpieza",
                "15/12/2018", true, true, 500, 800, 25);

        product p11 = new product("2p", "Cloro ", "lc", "Producto de limpieza",
                "15/12/2018", true, true, 1000, 2500, 50);

        product p12 = new product("3p", "Desifestante", "lc", "Producto de limpieza",
                "15/12/2018", true, true, 1005, 500, 10000);
        product p13 = new product("5p", "Desegrasante", "lc", "Producto de limpieza",
                "15/12/2018", true, true, 600, 800, 800);
    
    
    
    
    
    
 public DefaultListModel get_Depa3Products() {

        DefaultListModel model_Aux = new DefaultListModel();


        
          list_product_D3.add(p10);
        list_product_D3.add(p12);                ///--- individual lists 
        list_product_D3.add(p11);
        list_product_D3.add(p13);

        model_Aux.addElement(p10.getProduct_Name());
        model_Aux.addElement(p11.getProduct_Name());
        model_Aux.addElement(p12.getProduct_Name());
        model_Aux.addElement(p13.getProduct_Name());

        return model_Aux;

    }


    
        product p14 = new product("1p", "Lechuga ", "lc", " Verdura",
                "15/12/2018", true, true, 500, 700, 25);

        product p15 = new product("2p", "Tomate ", "lc", "Verdura  ",
                "15/12/2018", true, true, 200, 500, 50);

        product p16 = new product("3p", "Zanahoria", "lc", "Verdura  ",
                "15/12/2018", true, true, 325, 445, 10000);
        product p17 = new product("5p", "Culantro", "lc", "Verdura",
                "15/12/2018", true, true, 50, 200, 800);

 public DefaultListModel get_Depa4Products() {

        DefaultListModel model_Aux = new DefaultListModel();

        
        
        list_product_D4.add(p14);
        list_product_D4.add(p16);                ///--- individual lists 
        list_product_D4.add(p15);
        list_product_D4.add(p17);

        model_Aux.addElement(p14.getProduct_Name());
        model_Aux.addElement(p15.getProduct_Name());
        model_Aux.addElement(p16.getProduct_Name());
        model_Aux.addElement(p17.getProduct_Name());

        return model_Aux;

    }


        product p18 = new product("1p", "Papas Tostadas  ", "lc", "DEl Volcan",
                "15/12/2018", true, true, 500, 800, 25);

        product p19 = new product("2p", "Tortillas tostadas ", "lc", "Los bonejos",
                "15/12/2018", true, true, 1000, 2500, 50);

        product p20 = new product("3p", "Yucas tostadas ", "lc", "Tosty",
                "15/12/2018", true, true, 1005, 500, 10000);
        product p21 = new product("5p", "Platanos tostados", "lc", "Tosty",
                "15/12/2018", true, true, 600, 800, 800);
    
 public DefaultListModel get_Depa5Products() {

        DefaultListModel model_Aux = new DefaultListModel();

        
        
          list_product_D5.add(p18);
        list_product_D5.add(p20);                ///--- individual lists 
        list_product_D5.add(p19);
        list_product_D5.add(p21);

        model_Aux.addElement(p18.getProduct_Name());
        model_Aux.addElement(p19.getProduct_Name());
        model_Aux.addElement(p20.getProduct_Name());
        model_Aux.addElement(p21.getProduct_Name());

        return model_Aux;

    }

            product p22 = new product("1p", "Fanta ", "lc", "Gaseosa",
                "15/12/2018", true, true, 500, 800, 25);

        product p23 = new product("2p", "Coca Cola ", "lc", "Gaseosa",
                "15/12/2018", true, true, 1000, 2500, 50);

        product p24 = new product("3p", "Squirt", "lc", "Gaseosa",
                "15/12/2018", true, true, 1005, 500, 10000);
        product p25 = new product("5p", "7UP", "lc", "Gaseosa",
                "15/12/2018", true, true, 600, 800, 800);
 public DefaultListModel get_Depa6Products() {

        DefaultListModel model_Aux = new DefaultListModel();


        
          list_product_D6.add(p22);
        list_product_D6.add(p24);                ///--- individual lists 
        list_product_D6.add(p23);
        list_product_D6.add(p25);

        model_Aux.addElement(p22.getProduct_Name());
        model_Aux.addElement(p23.getProduct_Name());
        model_Aux.addElement(p24.getProduct_Name());
        model_Aux.addElement(p25.getProduct_Name());

        return model_Aux;

    }


///-*-*-----------------------------------------------------------------------------------------------------------------
// this method is to get the date
    
    public String date_Actual (){
     
        Date fech_Here = new Date();
         SimpleDateFormat fech_Format = new SimpleDateFormat("dd/MM/yyyy");
      
         String fechreturn = fech_Format.format(fech_Here);  // here is to adapt to the format
         return fechreturn;
    }

    //  ------------------------------------------------------------------------------------------------
    public void set_Information()
    {
        Bill_General fac1 = Factory_Bills.getBill_by_type("card");
        fac1.setDay("20");
        fac1.setId("f1");
        fac1.setIddClient("1");
        fac1.setMonth("04");
        fac1.setNameClient("Jimena");
        fac1.setYear("2018");
       
        Bill_General fac2 = Factory_Bills.getBill_by_type("card");
        
        fac2.setDay("25");
        fac2.setId("f2");
        fac2.setIddClient("1");
        fac2.setMonth("08");
        fac2.setNameClient("Jimena");
        fac2.setYear("2019");
         
        Bill_General fac3 = Factory_Bills.getBill_by_type("card");
        fac3.setDay("20");
        fac3.setId("f3");
        fac3.setIddClient("1");
        fac3.setMonth("09");
        fac3.setNameClient("Jimena");
        fac3.setYear("2018");
        
         
         
        Bill_General fac4 = Factory_Bills.getBill_by_type("card");
        fac4.setDay("25");
        fac4.setId("f4");
        fac4.setIddClient("1");
        fac4.setMonth("02");
        fac4.setNameClient("Jimena");
        fac4.setYear("2019");
        
        
        
        Bill_General fac33 = Factory_Bills.getBill_by_type("credit");
        fac4.setDay("04");
        fac4.setId("f4");
        fac4.setIddClient("2");
        fac4.setMonth("06");
        fac4.setNameClient("Jeudy");
        fac4.setYear("2019");
        
        
        Bill_General fac44 = Factory_Bills.getBill_by_type("cash");
        fac4.setDay("07");
        fac4.setId("f4");
        fac4.setIddClient("2");
        fac4.setMonth("06");
        fac4.setNameClient("Marlon");
        fac4.setYear("2019");
        
    
        list_product_General.add(p);
        list_product_General.add(p2);
        list_product_General.add(p1);
        list_product_General.add(p5);

        
        list_product_General.add(p6);
        list_product_General.add(p8);
        list_product_General.add(p7);
        list_product_General.add(p9);
        
        
        list_product_General.add(p10);
        list_product_General.add(p12);
        list_product_General.add(p11);
        list_product_General.add(p13);
        
        
        list_product_General.add(p14);
        list_product_General.add(p16);
        list_product_General.add(p15);
        list_product_General.add(p17);
        
        

        list_product_General.add(p18);
        list_product_General.add(p20);
        list_product_General.add(p19);
        list_product_General.add(p21);
        
        
        

        list_product_General.add(p22);
        list_product_General.add(p24);
        list_product_General.add(p23);
        list_product_General.add(p25);
        
        
        
        client cclient = new client("1", "Jimena ", "gime@mail.com", "Gold");
        
        
        
        client cclient1 = new client("2", "Jeudy  ", "jjj@mail.com", "Silver");
        
 
        client cclient2 = new client("3", "Marlon ", "mmmm@gmail.com", "Bronze");
        

         
        
        product p = new product("1p", "Leche sabemas", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true ,2800, 3500,25);
       
        product p1 = new product("2p", "Leche Pinito Dos pinos", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true ,2800, 3500,50);

        product p2 = new product("3p", "Leche en polvo Coronado", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true ,2800, 3500,10000);

        product p4 = new product("4p", "Leche Condensada", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true,2800, 3500,500);

        product p5 = new product("5p", "Leche Condensada", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true ,2800, 3500,800);
        
        product p6 = new product("6p", "Leche Condensada", "lc", "Leche semidescremada en polvo", 
                "15/12/2018", true, true ,2800, 3500,450);

       product px = new product("dp1", "Coca Cola", "d1", "Gaseosa", "15/12/2018",
               true, true ,2800, 3500,450);
       
       product np1 = new product("1", "papa", "comestibles", "Producto comestible",
        "21/10/2018", true,true,  1200, 1300,400); 
       np1.setProduct__ID_Department("x1");
       
       
       departament dd = new departament("x1", "Comestibles");
       
       
       departament dd1 = new departament("x2", "Verduras");
       
       
       departament dd2 = new departament("x3", "Licor");
       
       
       departament dd3 = new departament("x4", "Farmacia");
       
 

      //  bill bil = new bill("w", "1");
        
        products_Categories drinks = new products_Categories("d1", "Bebidas", "Liquidos ");
        
        
        products_Categories drinksAlcohol = new products_Categories("y1", "Bebidas Alcholicas", "Liquidos Alcoholicos ");
                
        products_Categories legumbres = new products_Categories("y2", "Legumbres", " Brocolis ");
        
        products_Categories pastillas = new products_Categories("y3", "Pildoras", "Anticonceptivas ");


        dd.setList_categories(legumbres);
        
        
        dd1.setList_categories(legumbres);
        
        
        dd2.setList_categories(drinksAlcohol);
        
        legumbres.setList_productsCategories(np1);
        
        dd3.setList_categories(pastillas);
        list_department.add(dd);
         list_department.add(dd1);

        list_department.add(dd2);

        list_department.add(dd3);
        drinks.setList_productsCategories(px);
        
        
        
        fac1.setList_productsBILL(p4);   
        
        
        fac1.setList_productsBILL(p2);
        
        fac1.setList_productsBILL(p1);
        
        fac1.setList_productsBILL(p);
     
        cclient.setList_billClient(fac1);
       
        fac33.setList_productsBILL(p4);
        
        fac44.setList_productsBILL(p);
        fac44.setList_productsBILL(p4);
       
        cclient1.setList_billClient(fac33);
        
        cclient2.setList_billClient(fac44);
        list_clients.add(cclient);
        
        list_clients.add(cclient1);
         list_clients.add(cclient2);
       
              
        
    }
    
    public void add_TextField_ToEmptyValidation(JTextField textCamp){
         list_EmptyValidation.add(textCamp);
    
    
    };
    
    
    
    
    public BigDecimal redond(double priceLoctal_Total){
    
 
                
                BigDecimal bd = new BigDecimal(priceLoctal_Total);
                bd = bd.setScale(2, RoundingMode.HALF_UP);	// Ponemos 2 decimales

                return bd;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    public Boolean validationEmpty( ){
    
        
        
        for (int i = 0; i < list_EmptyValidation.size(); i++) {
            if (list_EmptyValidation.get(i).getText().equals("")) {
                        // clean the list_Empty we dont want repeat the validations

                        list_EmptyValidation.clear();

                return false;
            }
        }
      list_EmptyValidation.clear();

        return true;
        
        
    }
    
    
    
    public departament returnPositionDepartment(String Code){
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(Code)) {
                
                departament aux = list_department.get(i);
                return aux;
                
            }
    }
        return null;
}
    
    
    
    // Is to return the month String name
   public String StringDate_ReturnMonth(String month){
   
       ArrayList<String> list_Moth = new ArrayList<>();
       
       list_Moth.add("------------------------------------------------------------------------------------------");
       list_Moth.add("January");
       list_Moth.add("February");
       list_Moth.add("March");
       list_Moth.add("April");
       list_Moth.add("May");
       list_Moth.add("June");
       list_Moth.add("July");
       list_Moth.add("August");
       list_Moth.add("September");
       list_Moth.add("October");
       list_Moth.add("November");
       list_Moth.add("December");
       
       Integer position = Integer.parseInt(month);
       
        return list_Moth.get(position ); 
               
}     

    
   
    public String getClientName(String idclient){
        for (client list_user : list_clients) {
            return list_user.getNameClient();
        }
        return "";
        
    }  
     public product copy_Product(String product_Code, String product_Name, String product_Category,
           String product_Description, String product_Date, boolean product_discount,
            boolean IVA , double priceBuy, double priceSale, int q ){
      
               String product_Code1= product_Code;
                       String product_Name1  =product_Name;
                               String product_Category1 =product_Category;
                               
           String product_Description1 =product_Description;
           
           
                   String product_Date1  =product_Date;
                           boolean product_discount1 = product_discount;
                                   
            boolean IVA1 = IVA;
                    
               double priceBuy1 = priceBuy ;
                       double priceSale1 = priceSale;
                               int q1 = q;
                               
               product productAux = new product (product_Code1, product_Name1, product_Category1, product_Description1, product_Date1,
                product_discount1,  IVA1   ,  priceBuy1   ,  priceSale1 ,q1);
        return productAux;
                         
                
    
    }
       
    
    public String Getta_productName(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Name();
                           // name product
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return null;
    
    };
    
        public String getta_ProductCategory(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Category();
                           // name category name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return null;
    
    };
  
        
  public String getta_productCategoryID(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                System.out.println("step 1");
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                                        System.out.println("step 2");

                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                                System.out.println("step 1");

                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_CategoryID();
                           // name category id  
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return null;
    
    };
    public String getta_ProductDate(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Date();
                           // name date name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return null;
    
    };
  
    
      
  //  public product(String product_Code, String product_Name, String product_Category,
    //       String product_Description, String product_Date, boolean product_discount,
    //        boolean IVA, String product_picture, double priceBuy, double priceSale, int q) {
        
    public String getta_productDescription(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Description();
                           // name category name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return null;
    
    };
  
  //  public product(String product_Code, String product_Name, String product_Category,
    //       String product_Description, String product_Date, boolean product_discount,
    //        boolean IVA, String product_picture, double priceBuy, double priceSale, int q) {
        
      public boolean getta_ProductIVA(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getIVA();
                           // name category name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return false;
    
    };
     public Boolean getta_ProductDiscount(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).isProduct_discount();
                           // name category name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return false;
    
    };
    
    
        public double getta_ProductBuy(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getPriceBuy();
                           // name buy name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return 0.0;
    
    };
    
    
    public double getta_ProductSale(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getPriceSale();
                           // name sale name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return 0.0;
    
    };
    
    
      public int getta_ProductQuanty(String idDepartment, String id_category, String idP){
    
        // to return the name of products
        
        for (int i = 0; i < list_department.size(); i++) {
            if (list_department.get(i).getDepartament_code().equals(idDepartment)) {
                
                for (int j = 0; j < list_department.get(i).getList_categories().size(); j++) {
                    if (list_department.get(i).getList_categories().get(j).getProducts_CategoriesCode().equals(id_category)) {
                        
                        for (int k = 0; k < list_department.get(i).getList_categories().get(j).getList_productsCategories().size(); k++) {
                            if (list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Code().equals(idP)) {
                                
                                return list_department.get(i).getList_categories().get(j).getList_productsCategories().get(k).getProduct_Quanty();
                           // name quanty name
                            
                            }
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        return 0;
    
    };
    
    
    
    
    
    
    
    public boolean modifyClient(String idCliente, String nameClient, String emailClient, String category_Client){
    
        if (idCliente.equals("") || nameClient.equals("") || emailClient.equals("") || category_Client.equals("")) {
            return false;
        }
        
        for (int i = 0; i < list_clients.size(); i++) {
            if (list_clients.get(i).getIdCliente().equals(idCliente)) {
    
                list_clients.get(i).setNameClient(nameClient);
                list_clients.get(i).setEmailClient(emailClient);
                list_clients.get(i).setCategory_Client(category_Client);
                return true;
            }
    
    
    }
    return false;
    
    }
    
    
    
    public boolean addClient(String idCliente, String nameClient, String emailClient, String category_Client){
    
        for (int i = 0; i < list_clients.size(); i++) {
            if (list_clients.get(i).getIdCliente().equals(idCliente)) {
                return false;
            }
        }
        
        client c = new client(  idCliente,   nameClient, emailClient, category_Client);
        
        list_clients.add(c);
        return true;   
        
    }
    
    public boolean deleteClient(String id){
        for (int i = 0; i < list_clients.size(); i++) {
            if (list_clients.get(i).getIdCliente().equals(id)) {
                list_clients.remove(list_clients.get(i));
                return true;
            }
        }
        return false;
    
    }

    
//
}  