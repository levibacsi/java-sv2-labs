package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        try {
            List<String> allIngredients = Files.readAllLines(path);
            for (String ingredient: allIngredients){
                String[] data = ingredient.split(" ");
                if (data.length > 1) {
                    String listItem = data[2];
                    ingredients.add(listItem);
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }

    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        System.out.println(recipe);
    }
}
