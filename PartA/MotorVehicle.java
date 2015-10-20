package partA;
   
public abstract class MotorVehicle {     // abstract class
    
    abstract void TurnOff();    // abstract methods
    abstract void TurnOn();
    
}

class Car extends MotorVehicle{     // sub class Car

    @Override
    void TurnOff() {    // overriding the abstract methods
        
        System.out.println("Car is Stopping");
        
    }

    @Override
    void TurnOn() {     // overriding the abstract methods
        
        System.out.println("Car is Starting");
        
    }
       
}
