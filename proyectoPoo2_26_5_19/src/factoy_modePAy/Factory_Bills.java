/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoy_modePAy;

/**
 *
 * @author User
 */
public class Factory_Bills {
    
    public static Bill_General getBill_by_type(String tipo) {
 if (tipo.equals("card")) {
 return new PayCard( );
 }
  if (tipo.equals("cash")) {
 return new PayCash();
 
 }
  if (tipo.equals("credit")) {
 return new PayCredit();
 }
  if (tipo.equals("paypal")) {
 return new PayPayPal();
 } if (tipo.equals("deposit")) {
 return new PayDeposit();
 }
  return null;    
     
    
}

}
