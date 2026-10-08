package Repository;

import entity.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRepository {
    private Map<String, Restaurant> store = new HashMap<>();
    public void save(Restaurant restaurant){
        store.put(restaurant.id,restaurant);
    }
    public Restaurant findById(String id){
        return store.get(id);
    }
    public List<Restaurant> findAll(){
        return new ArrayList<>(store.values());
    }

}
