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
public class Cheque extends PaymentMean implements Serializable{
    

    int numero;
    String instBancaria;
    
    public Cheque(){       
    }
    
    public Cheque(int n, String ib){
        super();
        numero = n;
        instBancaria = ib;
    }
  
       @Override
      public String toString(){   
          String s = "Numero: "+numero+"\nInst. Bancaria: "+instBancaria;              
          return super.toString()+s;
      
      }
}
