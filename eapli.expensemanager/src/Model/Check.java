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
    
    public Check(){       
    }
    
    public Check(int i,int n, String ib){
        super(i);
        numero = n;
        instBancaria = ib;
    }
  
       @Override
      public String toString(){   
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria;              
          return super.toString()+s;
      
      }
}
