/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Persistance;

import java.io.FileInputStream;
import java.util.Properties;

/**
*
* @author Tecnica21
*/
public class PersistenceFactory {
            //SINGLETON
      private PersistenceFactory() {

//vai ao ficheiro propriedades - expensemanager.properties- obter a
//a factory associada ao tipo de persistencia a usar.
 //Por omissão JpaRepositoryFactory
        try{
            FileInputStream propFile = new FileInputStream("expensemanager.properties");
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            System.setProperties(p);
        } catch(Exception e) {
              System.setProperty("PERSIST", "Persistance.JpaRepositoryFactory");
              // System.setProperty("PERSIST", "Persistance.InMemoryRepositoryFactory");
        }
      }
      
      //LAZY LOADING – create only when needed
      private static PersistenceFactory instance = null;

      public static PersistenceFactory getInstance() {
            if (instance == null) {
                  instance = new PersistenceFactory ();
            }
            return instance;
      }
      

    

      public IRepositoryFactory buildRepositoryFactory(){
                   String desc = System.getProperty("PERSIST");
        try
        {
            return (IRepositoryFactory) Class.forName(desc).newInstance();
        } catch(Exception ex)
        {
            return null;
        }

      }
}