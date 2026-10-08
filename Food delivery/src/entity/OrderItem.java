package entity;

import java.awt.*;

public class OrderItem {
    MenuItem menuItem;
    int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double getTotal(){
        return menuItem.price * quantity;
    }
}
