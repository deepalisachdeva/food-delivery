package entity;

import enums.CusineType;

public class MenuItem {
    String id;
    String name;
    double price;
    public CusineType cusineType;

    public MenuItem(String id, String name, CusineType cusineType, double price) {
        this.id = id;
        this.name = name;
        this.cusineType = cusineType;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + "($" + price + "," +cusineType+")";
    }
}
