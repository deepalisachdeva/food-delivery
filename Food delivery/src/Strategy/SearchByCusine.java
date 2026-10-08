package Strategy;

import entity.Restaurant;
import entity.MenuItem;
import enums.CusineType;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByCusine implements SearchStrategy{
    private CusineType cusineType;

    public SearchByCusine(CusineType cusineType) {
        this.cusineType = cusineType;
    }

    @Override
    public List<Restaurant> search(List<Restaurant> restaurants){
        return restaurants.stream()
                .filter(r -> r.menu.stream().anyMatch(m->m.cusineType==cusineType))
                .collect(Collectors.toList());
    }
}