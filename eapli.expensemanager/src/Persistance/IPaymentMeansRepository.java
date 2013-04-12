/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;
import Model.PaymentMean;
import java.util.List;

/**
 *
 * @author Tecnica21
 */
public interface IPaymentMeansRepository {
    void registerPaymentMean(PaymentMean pm);
    void showListPayMeans();
    List<PaymentMean> getListPayMeans();
}
