/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author imash
 */
public class ProductBillTest {
    public static void main(String[] args) {

        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            double total = bill.calculateTotal();
            System.out.println("Total Bill: "+total);
        } 
        catch (NumberFormatException e){
            System.out.println("Error: Price and quantity must be valid numbers.");

        }
        finally {
            System.out.println("Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
    
}
//Exception occurs because the text "two" cannot be converted into an integer.
