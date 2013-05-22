/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ruben Ferreira
 */
@Entity
public class Check extends PaymentMean implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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
