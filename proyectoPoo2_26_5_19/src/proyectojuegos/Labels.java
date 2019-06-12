

package proyectojuegos;

import javax.swing.JLabel;
/**
 *
 * @author jeudy 
 */
public class Labels extends JLabel{
    //Labels attributes
    public Labels(int posiX, int PosiY, int ancho, int largo){
        setBounds(posiX, PosiY, ancho, largo);
    }
}
