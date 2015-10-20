package partB;

/**  
 * Lab 08 CSM10J   
 * Abstract classes, inheritance  
 * super methods  
 *   
 * @author johnr  
 */ 

public class Program {
        
    public static void TestPartB()  // method deifinition
    {         
        System.out.println("Part B");
        partB.Car car = new partB.Car("Cadillac");  // class object
        System.out.println("Car is a " + car.getName());     
    } 
       
    public static void main(String[] args){      // main method 
        
        TestPartB();    // function call
        System.out.println();
            
    }
    
}
