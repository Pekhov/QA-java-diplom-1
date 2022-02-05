package praktikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Pekhov A.V.
 * @created 05/02/2022 - 11:12
 */

public class IngredientTest {

    @Test
    public void ingredientGetNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    public void ingredientGetPriceTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "hot sauce", 100);
        assertEquals(100, ingredient.getPrice());
    }

    @Test
    public void ingredientGetTypeTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "hot sauce", 100);
        assertEquals(IngredientType.FILLING, ingredient.getType());
    }
}
