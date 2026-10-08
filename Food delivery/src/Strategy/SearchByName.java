package Strategy;

import entity.Restaurant;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class SearchByName implements SearchStrategy {
    private String name;

    public SearchByName(String name) {
        this.name = name.toLowerCase();
    }

    @Override
    public List<Restaurant> search(List<Restaurant> restaurants){
        return restaurants.stream()
                .filter(r -> r.name.toLowerCase().contains(name))
                .collect(Collectors.toList());
    }
}
