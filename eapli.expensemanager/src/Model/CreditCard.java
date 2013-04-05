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
public class CreditCard extends PaymentMean {
    
    Date dataVal;
    long numero;
    String instBancaria;
    String tipo;
    
    public CreditCard(){}
    
    public CreditCard(Date dv, long n, String ib, String t){
        dataVal = dv;
        numero = n;
        instBancaria = ib;
        tipo = t;      
    }
    
    @Override
      public String toString(){   
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria+"\nTipo: "+tipo+"Data de Validade: "+dataVal+"\n";              
          return super.toString()+s;
      
      }
       
    
}
