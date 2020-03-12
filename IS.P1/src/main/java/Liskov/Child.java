package Liskov;

public class Child extends Person {
  
     private Adult tutor;

    public Child(Adult tutor, String name, String LastName) {
        super(name, LastName);
        this.tutor = tutor;
    }

    public Adult getTutor() {
        return tutor;
    }
     
     
}
