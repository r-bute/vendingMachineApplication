package com.perscholas.java_basics;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    //Attribute store the slots i.e String product codes are linked to the product object


   private Map<String, Slot<? extends Product>>Slot;//this is a collection interface representing K,V key value pairs

    public VendingMachine() {
        this.Slot = new HashMap<>();
    }

    //method to addProduct
    public <T extends Product> void addProduct(String code, Slot<T> slot) {
        this.Slot.put(code, slot);
    }

    //method to dispenseProduct
    public Product dispenseProduct (String code) {

        Slot slot = this.Slot.get(code);
        // checking if the slot even exists
        if (slot != null && slot.getQuantity() > 0 ) {
            slot.setQuantity(slot.getQuantity() - 1);
            return slot.getProduct();
        }
        else {
            System.out.println("Product not available");
            return null;
        }


    }

    //method to displayProducts
    public  void displayProducts() {
           /*
            * The Map's values are Slot objects. The wildcard ? extends Product indicates
            * that the map can store Slot objects containing any type that extends the
            * Product class.
            */
        for (Map.Entry<String, Slot<? extends Product>> entry : this.Slot.entrySet())
        {
            String code = entry.getKey();
            Slot<? extends Product> slot = entry.getValue();

            // Display the product details
            System.out.println("Code: " + code + ", Slot: " + slot);;
        }
        /*More personal notes
        *Slot<T> :is the generic type representing all the product types
        *'?' Wildcard :used the wildcard to enable user  to enter  any type of Product as a subclass of slot.
        *extends product help constrain the wildcard to values or objects only contained in slot.
         */

    }


}
