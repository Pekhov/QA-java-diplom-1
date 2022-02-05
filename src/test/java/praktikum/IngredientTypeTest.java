package praktikum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Pekhov A.V.
 * @created 05/02/2022 - 14:05
 */

public class IngredientTypeTest {

    @ParameterizedTest
    @EnumSource(IngredientType.class)
    public void ingredientTypeTest(IngredientType ingType) {
        Ingredient ingredient = new Ingredient(ingType, "salt", 10);
        assertEquals(ingType, ingredient.type);
    }

}
