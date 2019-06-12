
package proyectojuegos;

import clases.client;
import clases.grabation;
 import clases.metodos;
import static clases.metodos.list_clients;
import clases.product;
import factoy_modePAy.Bill_General;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import static proyectojuegos.win_Grabtions.modelAuxiliar;
import java.lang.Thread;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;





public final class win_Grabtions extends javax.swing.JFrame {

   
    public static int filas = 3;
    
    public static int columnas = 6;
    
    public static Labels[][] labels;
    Border border = LineBorder.createGrayLineBorder();
    public static int x = 0; //row
    public static int y = 0; //column
    int puntosGanados = 0;
    int puntosPerdidos = 0;
    int movimientos = 0;
    boolean bus = false;
    public static DefaultListModel<String> modelAuxiliar ;
    
    
    
    
    public static boolean  flag_depa1 = false;
     
    
    public static boolean  flag_depa2 = false;
     
    
    public static boolean  flag_depa3 = false;
     
    
    public static boolean  flag_depa4 = false;
     
    
    public static boolean  flag_depa5 = false;
     
    
    public static boolean  flag_depa6 = false;
     
    // here put code to insert information

    public win_Grabtions(GraphicsConfiguration gc) {
        super(gc);
    }
    
   
    
    
    //
    
    
    public static boolean busempezar = false;
    Integer[][] Matlog = new Integer[8][6];//object of the logic matrix

    public win_Grabtions() {
        initComponents();
        x = 0;
        y = 0;
        puntosGanados = 0;//gotten points 
        puntosPerdidos = 0;//lost points 
        
        movimientos = 0;//moves
        
        bus = false;
        busempezar = false;
        back.setBorder(null);
        back.setContentAreaFilled(false);
        cerrar.setBorder(null);
        cerrar.setContentAreaFilled(false);
        labels();
//        matrizLogica();
        jPanel1.setBackground(Color.gray);
    }

    public void labels() {
        int x = 20;
        int y = 20;
        labels = new Labels[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {//this generate the matrix with 8 rows and 5 columns
            for (int columna = 0; columna < columnas; columna++) {
                labels[fila][columna] = new Labels(x, y, 100, 80);// size of the square
                labels[fila][columna].setBorder(border);
                labels[fila][columna].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));//add an icon
                jPanel1.add(labels[fila][columna], null);//create a matrix on panel
                Matlog[fila][columna] = 1;//value of the position where the questions are going to be
                x += 100;
            }
            y += 80;
            x = 20;
        }
        // here are the stantes :v
   //
        
        ButtonController bt = new ButtonController();//method that make labels action
   
        labels[0][1].addMouseListener(bt);//add mouse action
        Matlog[0][1] = 0;//value of wildcard
        labels[0][1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

        
        
        
        
        
        
        
        
        
        
        labels[0][2].addMouseListener(bt);//add mouse action
        Matlog[0][2] = 0;//value of wildcard
        labels[0][2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

        labels[0][3].addMouseListener(bt);//add mouse action
        Matlog[0][3] = 0;//value of wildcard
        labels[0][3].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

        labels[0][4].addMouseListener(bt);//add mouse action
        Matlog[0][4] = 0;//value of wildcard
 
        labels[0][5].addMouseListener(bt);//add mouse action
        Matlog[0][5] = 0;//value of wildcard
 
        
        
        
        labels[2][1].addMouseListener(bt);//add mouse action
        Matlog[2][1] = 0;//value of wildcard
        labels[2][1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

        labels[2][2].addMouseListener(bt);//add mouse action
        Matlog[2][2] = 0;//value of wildcard
        labels[2][2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

        labels[2][3].addMouseListener(bt);//add mouse action
        Matlog[2][3] = 0;//value of wildcard
        labels[2][3].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estante.png")));//add icon for it

 labels[2][0].addMouseListener(bt);//add mouse action
        Matlog[2][0] = 0;//value of wildcard
 
 
 labels[2][3].addMouseListener(bt);//add mouse action
        Matlog[2][4] = 0;//value of wildcard
  labels[2][3].addMouseListener(bt);//add mouse action
        Matlog[2][5] = 0;//value of wildcard
 
                  
                  
                  
                  
                  
                  
        labels[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));//icon of the gamer
        Matlog[0][0] = 3;//value of the gamer
        labels[filas - 2][columnas - 1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/caja.jpg")));//icon of the final position
        Matlog[filas - 2][columnas - 1] = 4;//value of the final position
    }

    private class ButtonController implements MouseListener {

        public void actionPerformed(ActionEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            while (bus) {//Until the person has removed the obstacle it stops realizing this condition
                for (int i = 0; i < filas; i++) {
                    for (int k = 0; k < columnas; k++) {
                        if (e.getSource().equals(labels[i][k]) & Matlog[i][k] == 2) {//When the person selects the wildcard
                            labels[i][k].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));//change the background
                            Matlog[i][k] = 1;//It changes the value of the wildcard 
                            bus = false;//this line makes the action not to happen again
                            busempezar = true;//enable the play button
                          
                        } else if (e.getSource().equals(labels[i][k]) & Matlog[i][k] == 0) {//When the person selects the obstacles
                            labels[i][k].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));//change the background
                            Matlog[i][k] = 1;//It changes the value of the obstacle
                            bus = false;//this line makes the action not to happen again
                            busempezar = true;//enable the play button
                        }
                    }
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

 //   public void matrizLogica() {
      //  int p = 0;
      //  int l = 1;
    //    while (l <= 10) {
       //     int w = (int) (Math.random() * 8) + 0;//generte a random for take a impedimentum position
       ////     int i = (int) (Math.random() * 5) + 0;
      //      if (w != 0 || i != 1) {
      //          if (w != 1 || i != 0) {
                //    if (Matlog[w][i] == 1) {
                //        ButtonController bt = new ButtonController();//method that make labels action
                  //      labels[w][i].addMouseListener(bt);//add mouse action
                    //    Matlog[w][i] = 0;//value of impedimentum
                     //   labels[w][i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/obsta.jpg")));//and add icon for each one of them
                        
         //               
               //  //       l = l + 1;
       //             }
      //          }
      //      }
        //}
 /*       while (p < 1) {
            int z = (int) (Math.random() * 8) + 0;
            int v = (int) (Math.random() * 5) + 0;//generte a random for take a wildcard position
            if (z != 0 || v != 1) {
                if (z != 1 || v != 0) {
                   // if (Matlog[z][v] == 1) {
                        ButtonController bt = new ButtonController();//method that make labels action
                        labels[z][v].addMouseListener(bt);//add mouse action
                        Matlog[z][v] = 2;//value of wildcard
                        labels[z][v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comodin.jpg")));//add icon for it
                        p++;
                    }
                }
            }
        }
    }///

    public void preguntas() {
        int a = 0;
        String respuesta = "";
        int posi = (int) (Math.random() * 33);
//        System.out.println(posi);
        Icon imagen = new ImageIcon(getClass().getResource("/icon/signointerrogacion.png"));
        int seleccion = JOptionPane.showOptionDialog(
                null,
                Preguntas.preguntas[posi],
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                imagen, // null para icono por defecto.
                new Object[]{"True", "False"}, // null para YES, NO y CANCEL
                "");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
//                System.out.println("True");
                respuesta = "true";
            } else {
//                System.out.println("False");
                respuesta = "false";
            }
        }
        if (Respuestas.respuestas[posi].equals(respuesta)) {//It checks if the answers is correct
            puntosGanados++;
            ganados.setText(String.valueOf(puntosGanados));
            bus = true;////enable the MouseEvent
            busempezar = false;//disable the play button
            JOptionPane.showMessageDialog(null, "A acertado la pregunta, elimine un obstáculo\npara continuar respondiendo");
        } else {//It checks if the answer is incorrect
            puntosPerdidos++;
            perdidos.setText(String.valueOf(puntosPerdidos));
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            while (a < 1) {//add a new obstacle
                int v = (int) (Math.random() * 5) + 0;//generte a random for take a wildcard position
                int z = (int) (Math.random() * 8) + 0;
                if (Matlog[z][v] == 1) {
                    ButtonController bt = new ButtonController();//method that make labels action
                    labels[z][v].addMouseListener(bt);//add mouse action
                    Matlog[z][v] = 0;//value of wildcard
                    labels[z][v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/obsta.jpg")));//add icon for it
                    a++;
                }
            }
            bus = false;//disable the MouseEvent
            verificarPosicion();
        }

    }

   /*/ public void verificarPosicion() {//It checks the position of the player to see if this one caught between obstacles
        //right corner
        if (Matlog[x][y] == Matlog[0][4]) {
            if (Matlog[x][y - 1] == 0 & Matlog[x + 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x][y - 1] == 2 & Matlog[x + 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x][y - 1] == 0 & Matlog[x + 1][y] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
        } //lower left corner
        else if (Matlog[x][y] == Matlog[7][0]) {
            if (Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x - 1][y] == 2 & Matlog[x][y + 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
            //at the middle of the left side       
        } else if (Matlog[x][y] == Matlog[x][0]) {
            if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 2 & Matlog[x][y + 1] == 0 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 2 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x - 1][y] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
            //In the middle of the top part
        } else if (Matlog[x][y] == Matlog[0][y]) {
            if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 2 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 2 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
            //In the middle of the low part
        } else if (Matlog[x][y] == Matlog[7][y]) {
            if (Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x - 1][y] == 2 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 2 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
            //In the middle of the right part
        } else if (Matlog[x][y] == Matlog[x][4]) {
            if (Matlog[x + 1][y] == 0 & Matlog[x][y - 1] == 0 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 2 & Matlog[x][y - 1] == 0 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y - 1] == 2 & Matlog[x - 1][y] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            } else if (Matlog[x + 1][y] == 0 & Matlog[x][y - 1] == 0 & Matlog[x - 1][y] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
        } else {//in the middle
            if (Matlog[x][y] == 3 & Matlog[x + 1][y] == 0  & Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }else if (Matlog[x][y] == 3 & Matlog[x + 1][y] == 2  & Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }else if (Matlog[x][y] == 3 & Matlog[x + 1][y] == 0  & Matlog[x - 1][y] == 2 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }else if (Matlog[x][y] == 3 & Matlog[x + 1][y] == 0  & Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 2 & Matlog[x][y - 1] == 0) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }else if (Matlog[x][y] == 3 & Matlog[x + 1][y] == 0  & Matlog[x - 1][y] == 0 & Matlog[x][y + 1] == 0 & Matlog[x][y - 1] == 2) {
                JOptionPane.showMessageDialog(rootPane, "Estás encerrado\nPerdiste la partida");
            }
            return;
        }
    }

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-la-izquierda.png"))); // NOI18N
        back.setFocusable(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cerrar.setFocusable(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(816, 816, 816)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar)
                    .addComponent(back)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        //open the window to the quiz game and close the last window
        Juegos2 ventana = new Juegos2();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // close the window
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    
    
        public static void pausa() throws InterruptedException {
         sleep(5000);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
      //  jButton1.setText("Next Step");
        busempezar = true;//enable the play button
        try {
            saveStep();
        } catch (InterruptedException ex) {
            Logger.getLogger(win_Grabtions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    metodos m = metodos.getInstance();
 

    
    
    
    public void saveStep() throws InterruptedException      {
    
        
        int ccont = 0;
        ArrayList<grabation> array_MatrizPasos_Aux;
        array_MatrizPasos_Aux = new ArrayList<>();

        String idFacturemix = JOptionPane.showInputDialog("Write the Bill ID ").intern();

        String idClientaux = JOptionPane.showInputDialog("Write the client ID ").intern();

        for (client cc : list_clients) {
            if (cc.getIdCliente().equals(idClientaux)) {

                for (Bill_General fac : cc.getList_billClient()) {

                    if (fac.getId().equals(idFacturemix)) {

                        ccont++;
                       System.out.println("count " + fac.getList_steps().size());

                        for (grabation graba : fac.getList_steps()) {
                             try{
                         //    System.out.println("ID" +graba.getId_Depa()  + "Pos Y"+graba.getPosY() + "Pos X" + graba.getPosX());

                              array_MatrizPasos_Aux.add(graba);
                        
                              System.out.println("true");
                           //   labels[graba.getPosX()][graba.getPosY()].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));
                                
                          //    Thread.sleep(1800);
                              
                                                          //  labels[graba.getPosX()][graba.getPosY()].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));

                              
                             }catch(Exception e){
                                 System.out.println("");
                                   
                             }
                                

                          
                            
                             
                    
         
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }

        int contSteps = 0;
 


        
        
        
        
        
        
        
     try {
      while (contSteps < array_MatrizPasos_Aux.size()) {            
            
      
            int posXaux = array_MatrizPasos_Aux.get(contSteps).getPosX();
                 
            int posYaux = array_MatrizPasos_Aux.get(contSteps).getPosY();
            
            
            labels[posXaux][posYaux].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));
                                                  Thread.sleep(1800);

            System.out.println(" posicion x "+ posXaux + "poscion y " + posYaux );
                  
              
              contSteps++;

           // labels[posXaux][posYaux].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
             
            
            
           
            
        }
           
        } catch (InterruptedException ex) {
               
            System.out.println("Exception " + ex.getMessage());
        
        }
        double total = 0;
    
        for (client cc : list_clients) {
            
            if (cc.getIdCliente().equals(idClientaux)) {
                
                for( Bill_General bb : cc.getList_billClient()) {
                    if (bb.getId().equals(idFacturemix)) {
                        
                        for (product pp  : bb.getList_productsBILL()) {
                            
                            modelAuxiliar.addElement(" Name Product  " + pp.getProduct_Name());
                            modelAuxiliar.addElement(pp.getPriceTotal() + " Total price product ");
                             modelAuxiliar.addElement("    "  );


                            total = total + pp.getPriceTotal();
                            
                        }
                        
                    }
                    }
                
            }
        }
        
        
        
        modelAuxiliar.addElement("  ************************  ");
        
        modelAuxiliar.addElement("    ");
        
        modelAuxiliar.addElement(" Price all products   " + total);
        
        jList1.setModel(modelAuxiliar);
        

     
     
     
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       
              ArrayList array_MatrizPasos_Aux;
        array_MatrizPasos_Aux = new ArrayList<>();

        String idFacturemix = JOptionPane.showInputDialog("Write the Bill ID ").intern();

        String idClientaux = JOptionPane.showInputDialog("Write the client ID ").intern();

        
        
        
        
        
        
        for (client cc : list_clients) {
            if (cc.getIdCliente().equals(idClientaux)) {

                for (Bill_General fac : cc.getList_billClient()) {

                    if (fac.getId().equals(idFacturemix)) {

                        for (grabation graba : fac.getList_steps()) {

                            try {

                                
                              labels[graba.getPosX()][graba.getPosY()].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));

                                
                                
                                
                                Thread.sleep(1000);
                                
                                

                            } catch (InterruptedException ex) {

                                System.out.println("Exception " + ex.getMessage());

                            }
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                        }
                        
                        
                        
                        
                    }
                }
                
            }
            
        }
        try {
            
            System.out.println("esto");
            Thread.sleep(1000);
            
            
            
        } catch (InterruptedException ex) {
               
            System.out.println("Exception " + ex.getMessage());
        
        }

        
        

    }//GEN-LAST:event_jButton1KeyPressed

    
    
    
    
    
    DefaultListModel<String> model_Client_Bill  = new DefaultListModel<>();
    public void delete_SupermarketProduct(JList superMaketDepa){
    
       // df
        try {
            
                       DefaultListModel modelo = (DefaultListModel) superMaketDepa.getModel(); 
              
                       int index = superMaketDepa.getSelectedIndex();
                                  
                       //model_Client_Bill.addElement(taked);
                       //jList2_clientBill.setModel(model_Client_Bill);
                       
                       modelo.remove( index );
        }
        catch (Exception e){
              
           System.out.println(" ");
        }
    
    }
    
    metodos metodox = metodos.getInstance();
    
    DefaultListModel< String > xx  = new DefaultListModel<>();
    
   
    
    public product getProduct_Jlist(String nameP){
    
        for (product hh : metodos.list_product_General) {
            double tot = (double) hh.getPriceSale();
            System.out.println ( hh.getProduct_Name() +" fechas " + hh.getPriceSale());
        }
        
        
        
        for (product pro : metodos.list_product_General) {
            
            if (pro.getProduct_Name().equals(nameP)) {
                System.out.println("producto en metodo " + pro.getPriceTotal());
                return pro;
            }
            
        }
        return null;
    
    }
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    metodos mx = metodos.getInstance();    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
