/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Ruben Ferreira
 */
@Entity
public class DebitCard extends PaymentMean implements Serializable {
    
   
    long numero;
    String instBancaria;
    String tipo; 
    
    public DebitCard(){}
    
    public DebitCard(long n, String ib, String t){
        super();
        numero = n;
        instBancaria = ib;
        tipo = t;
    }
    
      @Override
      public String toString(){   
          String s = "Numero: "+numero+"\nInst. Bancaria: "+instBancaria+"\nTipo: "+tipo;              
          return super.toString()+s;
      
      }
}
