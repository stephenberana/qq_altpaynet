/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivitybootcamp.model;

/**
 *
 * @author Stephen
 */
public class Admin extends User {
    protected int productPrice;
            
    public void setProduct(String orderKey, int productPrice) {
        this.orderKey = orderKey;
        this.productPrice = productPrice;
    }
    
     public int getProductPrice(int productPrice) {
         return productPrice;
     }
}
