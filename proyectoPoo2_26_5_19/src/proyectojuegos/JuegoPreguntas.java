
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
import static proyectojuegos.JuegoPreguntas.modelAuxiliar;


public final class JuegoPreguntas extends javax.swing.JFrame {

   
    public static int filas = 3;
    
    public static int columnas = 6;
    

    public  ArrayList<grabation> array_MatrizPasos_Aux  = new ArrayList<>();;
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

    public JuegoPreguntas(GraphicsConfiguration gc) {
        super(gc);
    }
    
   
    
    
    //
    
    
    public static boolean busempezar = false;
    Integer[][] Matlog = new Integer[8][6];//object of the logic matrix

    public JuegoPreguntas() {
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

        
        btn_SelectProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anadir.jpg")));
        
        
        
        
        
        
        
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        move = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1_supermarketProduct = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2_clientBill = new javax.swing.JList();
        btn_SelectProduct = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("MOVIMIENTOS");

        move.setEditable(false);
        move.setBackground(new java.awt.Color(255, 255, 255));
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setText("Start");
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

        jList1_supermarketProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1_supermarketProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1_supermarketProduct);

        jScrollPane2.setViewportView(jList2_clientBill);

        btn_SelectProduct.setText("Select Product");
        btn_SelectProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectProductActionPerformed(evt);
            }
        });

        jButton2.setText("Devolution PRODUCT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pay method");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "card", "cash", "credit", "deposit", "paypal" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(91, 91, 91)
                .addComponent(btn_SelectProduct)
                .addGap(171, 171, 171)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(370, 370, 370))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cerrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(199, 199, 199)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1)
                                                    .addComponent(btn_SelectProduct))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        jButton1.setText("Next Step");
        busempezar = true;//enable the play button


    }//GEN-LAST:event_jButton1ActionPerformed

    metodos m = metodos.getInstance();
 

    
    
    public void saveStep(){
    
    
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       
          
         
        
        if (busempezar==true) { //------------------------------------------------ arriba 
            switch (evt.getExtendedKeyCode()) {
                case KeyEvent.VK_UP:
                    
                    

                    int xposgg = labels[x][y].getX();
                    int yposgg = labels[x][y].getY();
                    ///// here save a step
                 
                    
        
                    if (labels[x][y] == labels[0][y]) {
                        System.out.println("llegue ");
                        break;
                    }

                    if (labels[x][y] == labels[1][1]) {
                    
                        
                      JList<String> bt = new JList< >();//method that make labels action
                      bt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );

                      
                     DefaultListModel model_Aux = new DefaultListModel();

                      grabation grab2 = new grabation(1, labels[x][y].getX(), labels[x][y].getY());

                      
                      array_MatrizPasos_Aux.add(grab2);
                        
                        System.out.println("primer depa");
                        
                        
                        jList1_supermarketProduct.removeAll();
                        flag_depa1 = true;
                        
                        jList1_supermarketProduct.setModel(m.get_Depa1Products());

                        int pos = jList1_supermarketProduct.getLeadSelectionIndex(); /// is for get the index of a list 
   
                        System.out.println(" posicion del producto  " + pos );
                        
                        
                        
                        
                        
                     //   model_Aux.remove(pos);
                        
//                        m.get_Depa1Products().remove(pos);
                        
//                        model_Aux.remove(pos);
                        
                        
     
                        
                        bt.setModel(m.get_Depa1Products());
                        
                        int xxpos = labels[x][y].getX();
                        int yxpos = labels[x][y].getY();
                        int sizeH = labels[x][y].getHeight();
                                int sizeW= labels[x][y].getWidth();
                        bt.setVisible(true);
                               JPanel p =new JPanel(); 
                               p.setSize(sizeW, sizeH);
                               p.repaint(xxpos, yxpos, sizeW, sizeW);
                               p.setVisible(true);

                    }
                    if (labels[x][y] == labels[1][2]) {
                        System.out.println("segundo depa");

                        jList1_supermarketProduct.removeAll();

                        jList1_supermarketProduct.setModel(m.get_Depa2Products());


                    
                    
                    
                    }
                    if (labels[x][y] == labels[1][3]) {
                       System.out.println("tercer depa");
                        
                       
                        jList1_supermarketProduct.removeAll();

                        jList1_supermarketProduct.setModel(m.get_Depa3Products());


                                                   break;

                   }
                    
                    
                    else {
                        if (Matlog[x - 1][y] == 1) {
                            movimientos++;
                            
                            ///---------------------------------------------******************************************  
                            ///   up  MOVEMENT 
                            ///
                            grabation gb = new grabation(0, x,y);
                            
                            array_MatrizPasos_Aux.add(gb);
                            
                            
                            
                            
                            move.setText( String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            Matlog[x][y] = 1;
                            x--;
                             labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));

                            
                             Matlog[x][y] = 3;
                   
                      /// asdadadsa      
                            
                          // preguntas();
                            break;
                        } else if (Matlog[x - 1][y] == 0) {
                            break;
                        } else if (Matlog[x - 1][y] == 2) {
                            break;
                        }//
                    }

                case KeyEvent.VK_DOWN:
                    
                    ///// here save a step
                      
                    
         
                                        ///// here save a step

                    
                    
                    
                    
                    if (labels[x][y] == labels[filas - 1][y]) {
                        break;
                        
                        
                        
                        
                        
                        
                    }
                    
                    
                    if (labels[x][y] == labels[1][1]) {
                        System.out.println("cuarto depa");
                    
                           
                      
                        jList1_supermarketProduct.removeAll();

                        jList1_supermarketProduct.setModel(m.get_Depa4Products());
 
                        





                    
                    
                    }
                    if (labels[x][y] == labels[1][2]) {
                        System.out.println("quinto depa");
                        
                        jList1_supermarketProduct.removeAll();

                        jList1_supermarketProduct.setModel(m.get_Depa5Products());
                        
                        
                        
                        
                        
 

                    }
                    if (labels[x][y] == labels[1][3]) {
                        System.out.println("sexto depa");

                          
                        
                        jList1_supermarketProduct.removeAll();

                        jList1_supermarketProduct.setModel(m.get_Depa6Products());

                     //   jList1_supermarketProduct.removeAll();

                  //      jList1_supermarketProduct.setModel(m.get_Depa6Products());
                        break;

                    }
                     
                    else {
                        if (Matlog[x + 1][y] == 1) {
                            
                           ///---------------------------------------------******************************************  
                            ///   DOWN  MOVEMENT 
                            ///
                            
                            movimientos++;
                           
                            grabation gb = new grabation(0, x,y);
                            
                            array_MatrizPasos_Aux.add(gb);
                            
                            
                            
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            Matlog[x][y] = 1;
                            x++;
                           labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));
                            Matlog[x][y] = 3;
                         //   preguntas();
                            break;
                        } else if (Matlog[x + 1][y] == 0) {
                            break;
                        } else if (Matlog[x + 1][y] == 2) {
                            break;
                        } else if (Matlog[x + 1][y] == 4) {
                              
                     
                            
                            
                            
                        //   movimientos++;
                            move.setText(String.valueOf( movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            x++;
                            if (puntosGanados > puntosPerdidos) {
                                int puntosextra = puntosGanados - puntosPerdidos;
                                if (puntosextra >= 3) {
                                    labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triunfo.jpg")));
                                    Icon imagen = new ImageIcon(getClass().getResource("/imagenes/premio.png"));
                                    busempezar = false;
                                    JOptionPane.showMessageDialog(null, "GANASTE LA PARTIDA", "FELICITACIONES", JOptionPane.INFORMATION_MESSAGE, imagen);
                                
                                break;
                                }
                                break;
                            } else {
                                labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/perdio.jpg")));
                                Icon imagen = new ImageIcon(getClass().getResource("/icon/gameover.png"));
                                busempezar = false;
                                JOptionPane.showMessageDialog(null, "PERDISTE LA PARTIDA", "LO SIENTO", JOptionPane.INFORMATION_MESSAGE, imagen);
                            }
                            break;
                        }
                    }

                case KeyEvent.VK_RIGHT:
                    if (labels[x][y] == labels[x][columnas - 1]) {
                        
                        break;
                        
                    } else {
                        
                        if (Matlog[x][y + 1] == 1) {
                             ///---------------------------------------------******************************************  
                            ///   RIGHT  MOVEMENT 
                            ///
                            grabation gb = new grabation(0, x,y);
                            
                            array_MatrizPasos_Aux.add(gb);
                            
                            
                            
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            Matlog[x][y] = 1;
                            y++;
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));
                            Matlog[x][y] = 3;
                            break;
                        } else if (Matlog[x][y + 1] == 0) {
                            
                            break;
                        } else if (Matlog[x][y + 1] == 2) {
                            
                            break;
                        } else if (Matlog[x][y + 1] == 4) {
                            ///---------------------------------------------******************************************  
                            ///   lefth  MOVEMENT 
                            ///
                            movimientos++; 
                            
                            grabation gb = new grabation(0, x,y);
                            
                            array_MatrizPasos_Aux.add(gb);
                            
                            
                            
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            y++;
                            if (puntosGanados > puntosPerdidos) {
                                int puntosextra = puntosGanados - puntosPerdidos;
                                if (puntosextra >= 3) {
                                    labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triunfo.jpg")));
                                    Icon imagen = new ImageIcon(getClass().getResource("/imagenes/premio.png"));
                                    busempezar = false;
                                    JOptionPane.showMessageDialog(null, "GANASTE LA PARTIDA", "FELICITACIONES", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                break;
                            } else {
                                busempezar = false;

                            
                                
                                
                                
                        //       TO MAKE THE BUY
                                
                                
                                makeBill();
                                 
                                
                            
                            }
                            break;
                        }
                    }

                case KeyEvent.VK_LEFT:          ///---------------IZQUIERDA *------*-*-*-*-*-*--*
                    if (labels[x][y] == labels[x][0]) {
                        break;
                    } else {
                        if (Matlog[x][y - 1] == 1) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo1.jpg")));
                            Matlog[x][y] = 1;
                            y--;//
                            
                             labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho1.jpg")));


                            Matlog[x][y] = 3;
                          //  preguntas();
                            break;
                        } else if (Matlog[x][y - 1] == 0) {
                            break;
                        } else if (Matlog[x][y - 1] == 2) {
                            break;
                        }
                    }
            }
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
    /**
     On this buton whe acces to the list and get a index and make a comparation whth a flag to know 
     * the state
     
    
    
    /*/
    private void btn_SelectProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectProductActionPerformed
                        
                        
                  
                       // jList1_supermarketProduct.remove(pos);
                       // jList1_supermarketProduct.setModel(m.get_Depa1Products());
                        
                        try{
                        DefaultListModel modelo = (DefaultListModel) jList1_supermarketProduct.getModel(); 
                        
                        
                        
                       int index = jList1_supermarketProduct.getSelectedIndex() ;
                       
                                              System.out.println("index 1 " + index);
                        try{                      
                          String valuex = jList1_supermarketProduct.getSelectedValue().toString();
                          System.out.println("valor " + valuex);
                          model_Client_Bill.addElement(valuex);
                          jList2_clientBill.setModel(model_Client_Bill);
                        }
                        catch(Exception e){
                         
                             System.out.println("  ");
                        
                        
                        }
                      modelo.remove( index );
                        }
                        catch(Exception e){

                           JOptionPane.showMessageDialog(this, "Please select a product");
                        
                        }
                       
                      
                      
                      

// TODO add your handling code here:
    }//GEN-LAST:event_btn_SelectProductActionPerformed

    
    DefaultListModel< String > xx  = new DefaultListModel<>();
    
   
    private void jList1_supermarketProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1_supermarketProductMouseClicked

         
        
        
    }//GEN-LAST:event_jList1_supermarketProductMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
        
        int indexP = jList2_clientBill.getSelectedIndex();
        
        DefaultListModel<String> auxmodel = (DefaultListModel<String>) jList2_clientBill.getModel();

        jList2_clientBill.setModel(auxmodel);
        auxmodel.remove(indexP);
        }
        catch(  NullPointerException e)
        {
            JOptionPane.showMessageDialog(this, "Select the product of the bill" + "excep " + e.getCause().toString());
        
        }
   

    }//GEN-LAST:event_jButton2ActionPerformed

    
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
    
    
    
    
    
    
    
    
    
    
    
    public void makeBill(){
    
        ArrayList<product> arrayLocal_products = new ArrayList<>();

        
        String paymode = jComboBox1.getSelectedItem().toString();

        Bill_General billaux = factoy_modePAy.Factory_Bills.getBill_by_type(paymode);
        boolean confirmation_fact = false;
        boolean confirmation_c = false;

        String idFacturemix = JOptionPane.showInputDialog("Write the Bill ID ").intern();

        String idClientaux = JOptionPane.showInputDialog("Write the client ID ").intern();

        String clientn = "";
        
        for ( client clientx  : list_clients) {
            
            if (clientx.getIdCliente().equals(idClientaux)) {
                
                confirmation_c = true;
                
                clientn = clientx.getNameClient();
                try{
                for (Bill_General billx  : clientx.getList_billClient()) {
                    
                    if (billx.getId().equals(idFacturemix)) {
                        
                        
                        JOptionPane.showMessageDialog(this, " The bill code allready exist ");
                        confirmation_fact = true;
                        
                    }
                    
                    
                    
                }
             
                
                }   
                catch (Exception ex){
                      System.out.println("");
                }
           
            }
            
            
        }
        
             
        if (confirmation_c == false) {
                    
                    JOptionPane.showMessageDialog(this , " The client wasnt found");
                    JuegoPreguntas sj = new JuegoPreguntas();
                    sj.setVisible(true);
                    this.dispose();
                    
                }
         if (confirmation_fact == false) {
                    System.out.println("good");
                    String[] fg = m.date_Actual().split("/");
                    
                    
                    String dayaux = fg[0];
                    
                    String monthaux = fg[1];
                    
                    String yearaux = fg[2];
                    
                    billaux.setDay(dayaux);
                    billaux.setId(idFacturemix);
                    billaux.setIddClient(idClientaux);
                    billaux.setMonth(monthaux);
                    billaux.setYear(yearaux);
                    billaux.setNameClient(clientn);
                    
                    int i = 0;
                    int iproducto = 0;
                                        //selecciona un elemento de la lista 

                    //recoge el indice de los seleccionados 

                    
                    
           for (int ix = 0; ix < jList2_clientBill.getModel().getSize(); ix++) {
            
            
            
                         jList2_clientBill.setSelectedIndex(ix);
        
       
                        String nombrePp = (String) jList2_clientBill.getSelectedValue();
 
                         System.out.println(" " + nombrePp);
            
                         arrayLocal_products.add(getProduct_Jlist(nombrePp));
          
                         
                }
           
             for (client cc : list_clients) {
                 
                 if (cc.getIdCliente().equals(idClientaux)) {
                     
                    for (product pp : arrayLocal_products) {
                       
                        if (pp.getIVA() == true) {
                            
                            double auxIVA = (double) pp.getPriceSale() * 0.14;
                            cc.setTotalivaPAY( cc.getTotalivaPAY() + auxIVA );
                            
                        }
                 }
             }
            
                           
                        
                   
                   
               
        }
           
                    
             for (product prodaux : arrayLocal_products) {
                 
                 billaux.setList_productsBILL(prodaux);
                 
             }
        
             for (grabation STEPS : array_MatrizPasos_Aux) {
                 billaux.setList_steps(STEPS);
             }
             
               for (client cc  : metodos.list_clients) {
                 
                 if (cc.getIdCliente().equals(idClientaux )) {
                 
                     System.out.println("client yet exist");
                     
                     cc.setList_billClient(billaux);
                 }
               
               //
               
               }
             
                         
               JOptionPane.showMessageDialog(this, "Thank you");
                
       //      for (client cc  : metodos.list_clients) {
                 
       //          if (cc.getIdCliente().equals(idClientaux )) {
                     
                  //   for (Bill_General pp  :  cc.getList_billClient()) {
                         
                     //    if (pp.getId().equals(idFacturemix)) {
                             
                     //        for (product xa : pp.getList_productsBILL()) {
                                 
                     //            System.out.println(" NAME BOUGHT " + xa.getProduct_Name());
                                 
                   //              System.out.println(" price total BOUGHT " + xa.getPriceSale());
                       //      }
                             
                             
                 //        }
                         
                         
             //        }
                     
           //      }
                 
            // }

        



         }
    
         
         
         JuegoPreguntas s = new JuegoPreguntas();
         s.setVisible(true);
         this.dispose();
         
         
         
    }
    
    
    
    
    
    
    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveActionPerformed

    metodos mx = metodos.getInstance();    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btn_SelectProduct;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1_supermarketProduct;
    private javax.swing.JList jList2_clientBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField move;
    // End of variables declaration//GEN-END:variables
}
