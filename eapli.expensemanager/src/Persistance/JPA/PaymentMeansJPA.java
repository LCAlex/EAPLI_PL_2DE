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

    /*@Override
    public void showListPayMeans() {
        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT * FROM Cash, Check, CreditCard, Debit Card");
        System.out.println(q.getResultList());
    }*/

    @Override
    public List<PaymentMean> getListPayMeans() {
        return all(); //To change body of generated methods, choose Tools | Templates.
    }
}
