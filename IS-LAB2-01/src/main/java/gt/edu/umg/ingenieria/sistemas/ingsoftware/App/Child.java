package gt.edu.umg.ingenieria.sistemas.ingsoftware.App;

import java.util.*;

/**
 * 
 */
public class Child extends Person {


    /**
     * 
     */
    private Adult Tutor;

    /**
     * @param Name 
     * @param LastName 
     * @param Tutor
     */
    public Child(String Name, String LastName, Adult Tutor) {
        super(Name, LastName);
         this.Tutor=Tutor;
    }
    
    public Adult getTutor() {
    return Tutor;
  }

}