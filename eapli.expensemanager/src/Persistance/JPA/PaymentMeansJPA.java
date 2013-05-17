/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance.JPA;

/**
 *
 * @author mcatia
 */
import Model.PaymentMean;
import java.util.List;
import Persistance.IPaymentMeansRepository;
import eapli.util.DateTime;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Catia Marques 1120066
 */
public class PaymentMeansJPA extends JpaGeneric<PaymentMean, Long> implements IPaymentMeansRepository {

    @Override
    public void registerPaymentMean(PaymentMean pm) {
        save(pm);
    }

    @Override
    public void showListPayMeans() {
        List<PaymentMean> listPayments = all();
        for (int i = 0; i < listPayments.size(); i++) {
            System.out.println("- " + listPayments.get(i).getClass().getName());
            System.out.println(listPayments.get(i));
        }
        System.out.println("\n");
        //TODO testes unitarios
    }

    @Override
    public List<PaymentMean> getListPayMeans() {
        return all(); //To change body of generated methods, choose Tools | Templates.
    }
}
