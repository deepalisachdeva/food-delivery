package Controller;

import Service.RestaurantService;
import Strategy.SearchByCusine;
import entity.MenuItem;
import entity.Restaurant;
import enums.CusineType;

import java.util.List;

public class RestaurantController {
    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public Restaurant register(String id, String name, List<MenuItem> menuItems){
        return restaurantService.registerRestaurant(id,name,menuItems);
    }
    public List<Restaurant> searchByCusine(String cusine){
        CusineType type = CusineType.valueOf((cusine.toUpperCase()));
        return restaurantService.search(new SearchByCusine(type));
    }

}
