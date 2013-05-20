/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ruben Ferreira
 */
@Entity
public abstract class PaymentMean implements Serializable {
    
    //static int ID = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    public PaymentMean(){}
    
    public PaymentMean(int i){
        id = i;
    }
    
     @Override
      public String toString(){   
          String s = "ID:" + this.id;              
          return s;
      }
}
