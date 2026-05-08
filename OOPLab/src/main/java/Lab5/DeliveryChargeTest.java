
package Lab5;

public class DeliveryChargeTest {
  
    public static void main(String[] args){
       DeliveryChargeCalculator calculator1 = new DeliveryChargeCalculator();
       
       double charge1=calculator1.calculateCharge(1000.0);
       double charge2=calculator1.calculateCharge(1000.0,5.0);
       double charge3=calculator1.calculateCharge(1000.0,5.0,10.0);
       double charge4=calculator1.calculateCharge(1000.0,true);
       
       System.out.println("Base charge = "+charge1);
       System.out.println("Base + Distance charge = "+charge2);
       System.out.println("Base + Distance charge + Weight charge = "+charge3);
       System.out.println("Base + Express delivery charge ="+charge4);
      
       //This is compile-time polymorphism because Java chooses the correct overloaded method based on parameter lists.
       
    }
 }
