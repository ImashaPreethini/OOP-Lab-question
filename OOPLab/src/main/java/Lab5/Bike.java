/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author imash
 */
public class Bike extends Vehicle {
   private int numberOfHours;
   private double hourlyRate;

    public Bike(String vehicleNumber, String brand,int numberOfHours, double hourlyRate) {

        super(vehicleNumber, brand);

        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost();

        return numberOfHours * hourlyRate;
    }  
    
}
