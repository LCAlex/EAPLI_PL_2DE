/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeTypeRegisterController;
import Model.IncomeType;
import eapli.util.Console;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Barrakeiro
 */
public class IncomeTypeRegisterUI extends BaseUI{
    IncomeTypeRegisterController controller = new IncomeTypeRegisterController();
    
    @Override
    public void header(){
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
    }
    
    @Override
    public BaseController controller(){
        return controller;
    }
    
    public IncomeTypeRegisterUI() {}

    @Override
    public void run() {
        String name;
        do{
            controller.obtainList();
            name = Console.readLine("\n\nInsert the Income Type Name: ");
            if(name.equalsIgnoreCase("end")){
                // Do nothing
            }else{
                controller.registerIncomeType(name);
            }
        }while(!name.equalsIgnoreCase("end"));
     }

    public void displayList(List <IncomeType> incomeTypeList) {
        for(IncomeType d:incomeTypeList) {
            System.out.println(d);
        }
    }
}