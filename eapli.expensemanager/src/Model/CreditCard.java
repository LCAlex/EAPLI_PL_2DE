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
    int numero;
    String instBancaria;
    String tipo;
    
    public CreditCard(){}
    
    public CreditCard(int i,Date dv, int n, String ib, String t){
        super(i);
        dataVal = dv;
        numero = n;
        instBancaria = ib;
        tipo = t;      
    }
    
    @Override
      public String toString(){   
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria+"\nTipo: "+tipo+"Data de Validade: "+dataVal;              
          return super.toString()+s;
      
      }
       
    
}
