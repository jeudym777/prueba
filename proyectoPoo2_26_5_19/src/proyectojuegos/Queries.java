 
package proyectojuegos;

import clases.bill;
import clases.client;
import clases.departament;
import clases.product;
import clases.products_Categories;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import clases.metodos;
import static clases.metodos.list_clients;
import factoy_modePAy.Bill_General;
 
public class Queries extends javax.swing.JFrame {

     
    public Queries() {
        initComponents();
    }

       public DefaultListModel modelo = new DefaultListModel();
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inonves Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Invonnces client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("View Products");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Clients Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("IVA per Client");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addGap(27, 27, 27)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(96, 96, 96)
                        .addComponent(jButton7)
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public void nothing(){
        System.out.println(" ");
        
        boolean e = false;
        if (e == false)
            System.out.println("");    
       
    }
    
    
    
    int caux = 0;

    public void possibleSolution(){
          
        if (caux == 0) {
            System.out.println("");
            caux = 1;
            return;
        }
        modelo.clear();
        
        ArrayList<client> list_AUX = new ArrayList<client>();

        ArrayList<client> list_AUX2 = new ArrayList<client>();

        
        int c1 =0;
        
        
        int c2 =0;
        
        
        // are the counters of ids
        
        for (int i = 0; i < metodos.list_clients.size(); i++) {
            
            list_AUX.add(metodos.list_clients.get(i));
            
            
        }
       
        for (int i = 0; i < metodos.list_clients.size(); i++) {
            for (int j = 0; j < metodos.list_clients.get(i).getList_billClient().size(); j++) {
                 
                  modelo.addElement(metodos.list_clients.get(i).getNameClient());
                 
                  modelo.addElement("                     ");
                  modelo.addElement("Email " + metodos.list_clients.get(i).getEmailClient());
                  
                  
                  
                  
                  
                  modelo.addElement("Client Category  " + metodos.list_clients.get(i).getCategory_Client() );   
                  
            // here add the element to the model to set in jlist1
                  
            }
        }
        while (!list_AUX2.isEmpty()) {            
            
                   
                    
                   

        }
        
        int position = c1 +  1 ;

        
        if ((!list_AUX2.get(c2).equals(list_AUX.get(c1))))
            
        {            c1++;}
        
         
        
        while (c1 < list_AUX.size()) {            
            
          while (c2 < list_AUX2.size()){
              
              
              
              
            if (!list_AUX2.get(c2).equals(list_AUX.get(c1))) {
                c1++;                           
            }
            
            
            list_AUX2.add(list_AUX.get(c1));
             
            c1++;
            
            if (c1 == list_AUX.size()) {
                System.out.println("error main");
                c1 = 0;
                c2++;
                
                System.out.println("Cantidad de producto   " + list_AUX2.size() );
                modelo.addElement(" Product Quanty  " +    Integer.toString(list_AUX2.size() + 1));
               // list_AUX.clear();
                
                System.out.println("error 1");
                try {
                    
                 
               if (list_AUX.isEmpty()) {
                        nothing();
                }
    
                 
               
                 
                for (int w = 0; w < list_AUX.size(); w++) {
                    
                    if (list_AUX.isEmpty()) {
                        
                        System.out.println("Relax");
                        JOptionPane.showMessageDialog(this, "relax ");
                    }
                    
                    
                    if (list_AUX.get(w).getIdCliente().equals(list_AUX2.get(c2).getIdCliente())  && !list_AUX.isEmpty()) {
                     
                        
                        
                        System.out.println("error2");
                        
                        
                        try{
                        list_AUX.remove( list_AUX.get(w) );
                        }catch (java.lang.IndexOutOfBoundsException e){
                            System.out.println("e"+e.toString());}
                    
                        
                        
                        
                }   
                    
             
                
                            
                        
                        
                        
                    }
                }
                   catch (java.lang.IndexOutOfBoundsException e) {
                       
                        System.out.println(""+ e.toString() );
                    
                
            }
            
            
            
        }
        
        
        }
        
        
        jList1.setModel(modelo);
        
        
        
        
        
        
        
        
        
        
        
}
        
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // hashMap with multiple values with default size and load factor

        modelo.clear();

            InvoicesProducts vent = new InvoicesProducts();
        vent.setVisible(true);
        this.dispose();
        
        
        
        
        
        
        
        
        
        
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.clear();
        
        InvoicesPClient e = new InvoicesPClient();
        e.setVisible(true);
        this.dispose();
     
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    metodos metodox = metodos.getInstance();

    
    
    public String return_String_nameCategory(String id){
    
        
        for (int i = 0; i < metodos.list_inventory.size(); i++) {
            if (metodos.list_inventory.get(i).equals(id)) {
                return metodos.list_inventory.get(i).getNameCategory();
            }
        }
      return "";
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        modelo.clear();
                //modelo.clear();

        for (product  z : metodos.list_product_General) {

          
                     modelo.addElement("Name Product: " + z.getProduct_Name());

                    modelo.addElement("Description Product: " + z.getProduct_Description());

                    modelo.addElement("Price buy Product: " + z.getPriceBuy());

                    modelo.addElement("Price sale Product: " + z.getPriceSale());

                    
                    modelo.addElement("Date Expiration Product: " + z.getProduct_Date());

                    if (z.getIVA() == true) {
                        modelo.addElement("IVA Product: 14% ");
                         modelo.addElement("Client iva " + metodox.redond(z.getPriceTotaliva()));

                    }
                    if (z.isProduct_discount() == true) {
                        modelo.addElement("Discount = Yes ");
 

                    }
                     if (z.isProduct_discount() == false) {
                        modelo.addElement("Discount = No ");
 

                    }

                

                modelo.addElement(" ---------- ");

                modelo.addElement(" ---------- ");

            

        }

        
          for (product  z : metodos.list_product_General) {

          
                     System.out.println("Name Product: " + z.getProduct_Name());
 

                    if (z.getIVA() == true) {
                        System.out.println("IVA Product: 14% ");
 
                    }
                    if (z.isProduct_discount() == true) {
                           System.out.println("Discount = Yes ");
 

                    }
                     if (z.isProduct_discount() == false) {
                           System.out.println("Discount = No ");
 

                    }

                

                    System.out.println(" ---------- ");

                modelo.addElement(" ---------- ");

            

        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                              jList1.setModel(modelo);
      
                
                
                
                
                
                
                
                
                
               
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modelo.clear();
        for (int i = 0; i <  list_clients.size(); i++) {
            modelo.addElement("------------------------------------------------- ");
            modelo.addElement("Client name " + list_clients.get(i).getNameClient());
            modelo.addElement("Client ID " + list_clients.get(i).getIdCliente());
            modelo.addElement("Client email " + list_clients.get(i).getEmailClient());
            modelo.addElement("Client category " + list_clients.get(i).getCategory_Client());
            modelo.addElement("------------------------------------------------- ");
            modelo.addElement("  ");

            
        }
        jList1.setModel(modelo);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
    
    
    
    
    
    public double priceTotaliva(double priceT){
    
    
        double devolutionP ;
        devolutionP = priceT * 0.14;
    
        return devolutionP;
    
    
    }
    
    
    
    
    
    public void payPer_IVA(){
    
    

    
        metodos inst = metodos.getInstance();
        for (client cc : list_clients) {
            
            modelo.addElement("Name client " + cc.getNameClient());
            
            modelo.addElement("Total money pay per IVA " + inst.redond(cc.getTotalivaPAY()));
            modelo.addElement("------------------------------------------------" );
            modelo.addElement(  " ");

        
        
        }
    
    
        jList1.setModel(modelo);
    
    
    
    }
    
    
    
    
    
    
    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modelo.clear();
      
        
        
        payPer_IVA();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Juegos2 x = new Juegos2();
        x.setVisible(true);
        this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
 
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
