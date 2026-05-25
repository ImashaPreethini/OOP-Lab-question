/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author imash
 */
public class StudentAverageTest {
    public static  void main(String[] args){
        StudentAverageCalculator Calculator1=new StudentAverageCalculator(400,0);
        
        try{
            int average = Calculator1.calculateAverage();
            System.out.println("Average:"+average);
        }
        
        catch(ArithmeticException e){
            System.out.println("Error:Number of students cannot be zero.");
        }
        
        finally{
            System.out.println("Average calculation completed.");
        }
        
        System.out.println("Program continues...");
        
    }
    
}
