package Service;

import Repository.RestaurantRepository;
import Strategy.SearchStrategy;
import entity.MenuItem;
import entity.Restaurant;

import java.util.List;

public class RestaurantService {
    private RestaurantRepository repo;

    public RestaurantService(RestaurantRepository repo){
        this.repo = repo;
    }

    public Restaurant registerRestaurant(String id, String name, List<MenuItem> items){
        Restaurant restaurant = new Restaurant(id,name);
        for(MenuItem item : items){
            restaurant.addMenuItem(item);
        }
        repo.save(restaurant);
        return restaurant;
    }
    public Restaurant getRestaurant(String id){
        return repo.findById(id);
    }
    public List<Restaurant> search(SearchStrategy strategy){
        return strategy.search(repo.findAll());
    }

}
