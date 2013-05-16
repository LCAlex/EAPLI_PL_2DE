/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ruben Ferreira
 */
public class DebitCard extends PaymentMean {
    
    long numero;
    String instBancaria;
    String tipo; 
    
    public DebitCard(){}
    
    public DebitCard(int i,long n, String ib, String t){
        super(i);
        numero = n;
        instBancaria = ib;
        tipo = t;
    }
    
      @Override
      public String toString(){   
          String s = "\nNumero: "+numero+"\nInst. Bancaria: "+instBancaria+"\nTipo: "+tipo;              
          return super.toString()+s;
      
      }
}
