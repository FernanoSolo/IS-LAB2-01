package Liskov;

public class Adult extends Person {

    public Adult(String DPI, String CreditCard, String name, String LastName) {
        super(name, LastName);
        this.DPI = DPI;
        this.CreditCard = CreditCard;
    }

    public String getDPI() {
        return DPI;
    }

    public String getCreditCard() {
        return CreditCard;
    }
    
    

    
    
      private String DPI;
      private String CreditCard;

        public void pay() {
    System.out.println("mi DPI es " + getDPI() + "pago con la tarjeta" + CreditCard);
  }
    
}
