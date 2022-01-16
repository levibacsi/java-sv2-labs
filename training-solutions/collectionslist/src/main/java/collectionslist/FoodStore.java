package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {
    private List<Food> foods = new LinkedList<>();

    public List<Food> getFoods() {
        return foods;
    }

    public void addFood(Food food){
        foods.add(food);
    }

    public void sellFirst (Food food){
        if (LocalDate.now().equals(food.getExpirationDate())){
            foods.add(0, food);
        }
    }
}
