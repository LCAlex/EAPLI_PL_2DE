/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.BootstrapperClass;

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
          BootstrapperClass boot = new BootstrapperClass();
          MainMenu menu = new MainMenu();
          menu.mainLoop();
      }
}
