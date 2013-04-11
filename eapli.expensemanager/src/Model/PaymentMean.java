/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ruben Ferreira
 */
public abstract class PaymentMean {
    
    static int ID = 0;
    int id;
    
    public PaymentMean(){
        ID++;
        id = ID;
    }
    
     @Override
      public String toString(){   
          String s = "ID:" + this.id;              
          return s;
      }
}
