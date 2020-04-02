package gt.edu.umg.ingenieria.sistemas.ingsoftware.App;

import java.util.*;

public class App {

    public App() {
    }


    /**
     * 
     * @param args
     */
     public static void main(String[] args) {
         
    Adult adult = new Adult("pedro","perez",12345678,40505090);
    Child child = new Child("ana","sanchez",adult);
    
    child.getTutor().Pay();
    
   
  }

}