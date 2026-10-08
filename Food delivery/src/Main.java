import Controller.RestaurantController;
import Repository.RestaurantRepository;
import Service.RestaurantService;
import entity.MenuItem;
import enums.CusineType;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RestaurantRepository restaurantRepository = new RestaurantRepository();
        RestaurantService restaurantService = new RestaurantService(restaurantRepository);

        RestaurantController restaurantController = new RestaurantController(restaurantService);

        restaurantController.register("r1","XYZ", Arrays.asList(
                new MenuItem("m1","Classic Burger",CusineType.ITALIAN,80)));

        restaurantController.register("r2","ABC", Arrays.asList(
                new MenuItem("m1","Classic PIZZA",CusineType.ITALIAN,100)));

        System.out.println("Registered Italian");

        System.out.println("ITALIAN" + restaurantController.searchByCusine("ITALIAN"));

    }
}