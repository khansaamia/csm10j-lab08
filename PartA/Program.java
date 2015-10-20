package partA;

/**  
 * Lab 08 CSM10J   
 * Abstract classes, inheritance  
 * super methods  
 *   
 * @author johnr  
 */ 

public class Program {
    
    public static void TestPartA(){     // method definition
         
        System.out.println("Part A"); 
        partA.Car car = new partA.Car();    // class object declaration
        car.TurnOn();       
        car.TurnOff();  // function calls
 
    }

     
    public static void main(String[] args){     // main method
        
        TestPartA();    // function call
        System.out.println();
     
    }
    
}
