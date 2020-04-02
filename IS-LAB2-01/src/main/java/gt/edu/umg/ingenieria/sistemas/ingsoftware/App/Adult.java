package gt.edu.umg.ingenieria.sistemas.ingsoftware.App;

import java.util.*;

/**
 * 
 */
public class Adult extends Person {

    
    /**
     * 
     */
    private int DPI;

    /**
     * 
     */
    private int CreditCard;

    /**
     * @param DPI 
     * @param Name 
     * @param LastName 
     * @param CreditCard
     */
    
     public Adult(String name, String LastName, int DPI, int CreditCard) {
    super(name, LastName);
    this.DPI = DPI;
    this.CreditCard = CreditCard;
  }

    /**
     * @return
     */
    public int getCreditCard() {
        // TODO implement here
        return CreditCard;
    }

    /**
     * @return
     */
    public int getDPI() {
        // TODO implement here
        return DPI;
    }

    /**
     * @return
     */
    public Void Pay() {
       System.out.println("mi DPI es " + getDPI() + "pago con la tarjeta" + CreditCard);
        return null;
    }

}