/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Ruben Ferreira
 */
public class CreditCard extends PaymentMean implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
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
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria+"\nTipo: "+tipo+"\nData de Validade: "+dataVal;              
          return super.toString()+s;
      
      }
       
    
}
