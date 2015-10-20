package partB;

public abstract class MotorVehicle {    // abstract class
    
    private String name;    // private member
    
    public String getName()     // public function
    {
        return name;
    }
    
    public MotorVehicle(String str) // constructor
    {
        name = str;
    }
    
}

class Car extends MotorVehicle{     // sub class

    public Car(String str) {        / calling the constructor
        super(str);
    }
      
}
