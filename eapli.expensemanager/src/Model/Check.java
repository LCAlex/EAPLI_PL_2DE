/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Ruben Ferreira
 */
public class Check extends PaymentMean {
    
    int numero;
    String instBancaria;
    Date data;
    
    public Check(){       
    }
    
    public Check(int n, String ib){
        numero = n;
        instBancaria = ib;
    }
  
       @Override
      public String toString(){   
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria+"\n";              
          return super.toString()+s;
      
      }
}
