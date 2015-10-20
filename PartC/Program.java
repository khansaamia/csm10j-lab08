package partC;

/**  
 * Lab 08 CSM10J   
 * Abstract classes, inheritance  
 * super methods  
 *   
 * @author johnr  
 */ 

public class Program {
    
    public static void TestPartC(){ 
        
        System.out.println("Part C"); 
        partC.Convertible mercedes = new partC.Convertible("SL550", false); 
        mercedes.TurnOff();
        
    }
    
    public static void main(String[] args){     // main method

        TestPartC();    // function call

    }

}
