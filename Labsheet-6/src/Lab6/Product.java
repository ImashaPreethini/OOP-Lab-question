/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author imash
 */
public class Product {

    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(String productName,double unitPrice,int quantity){
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {
        return unitPrice * quantity;
    }

    public String getStockStatus() {

        if (quantity < 5) {
            return "Low Stock";
        } else {
            return "Available";
        }
    }
}
    

