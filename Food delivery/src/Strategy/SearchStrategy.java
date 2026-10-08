package Strategy;

import entity.Restaurant;

import java.util.List;

public interface SearchStrategy {
    List<Restaurant> search(List<Restaurant> restaurants);
}
