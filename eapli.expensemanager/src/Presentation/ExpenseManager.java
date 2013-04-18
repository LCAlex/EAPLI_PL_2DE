/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//import Eapli.ExpensesBootstrapper;

import Eapli.Bootstrapper;
import Eapli.ExpenseTypeBootstrapper;

//import Eapli.ExpenseTypeBootstrapper;

/**
 *
 * @author mcn
 */
public class ExpenseManager {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            // TODO code application logic here
            ExpenseTypeBootstrapper bootType;
            bootType = new ExpenseTypeBootstrapper();
          
            Bootstrapper boot;
            boot = new Bootstrapper();
            MainMenu menu=new MainMenu();
            menu.mainLoop();
      }
}
