package partC;

public abstract class MotorVehicle {     // abstract class
    
    abstract void TurnOff();        // abstract methods
    abstract void TurnOn();
    
    private String name;    // private class member
    
    public String getName()     // public method
    {
        return name;
    }
    
    public MotorVehicle(String str) // constrcutor
    {
        name = str;
    }
}

class Car extends MotorVehicle{     // sub class

    public Car(String str) {    // calling the constructor
        super(str);
    }

    @Override
    void TurnOff()      // overriding abstract methods
    {
        partC.Car c1 = new partC.Car("SL550");          // class object 
        System.out.println(c1.getName() + " is Stopping");
    }

    @Override
    void TurnOn()   // overriding abstract methods
    {   
        partC.Car c1 = new partC.Car("SL550");      // class object 
        System.out.println(c1.getName() + " is Starting");
    }
    
}

class Convertible extends Car{      // sub class
    
    private boolean topUp;      // private member
    
    Convertible(String name, boolean topup)     // constructor
    {
        super(name);        // super to call it
        topUp = topup;       
    }
   
    public void putTopUp()      // public method
    {
        topUp = true;
        System.out.println("Putting top up");
    }
    
    @Override
    void TurnOff()      // overriding abstract method
    {
        putTopUp();
        super.TurnOff();
    }   
}
