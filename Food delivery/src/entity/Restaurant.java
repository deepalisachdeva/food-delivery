package entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String id;
    public String name;
    public List<MenuItem> menu =new ArrayList<>();

    public Restaurant(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }
    @Override
    public String toString(){
        return "{"+"Restaurant" + name + "menu" + menu +"}";
    }
}
