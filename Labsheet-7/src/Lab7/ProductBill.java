/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author imash
 */
public class ProductBill {
    private String priceText;
    private String quantityText;
    
    public ProductBill(String priceText,String quantityText) {
        this.priceText=priceText;
        this.quantityText=quantityText;
    }
    
    public double calculateTotal(){
        double price= Double.parseDouble(priceText);
        int quantity= Integer.parseInt(quantityText);
        return price*quantity;
    }
}
