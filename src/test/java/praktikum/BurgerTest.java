package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Pekhov A.V.
 * @created 05/02/2022 - 11:49
 */

@ExtendWith(MockitoExtension.class)
public class BurgerTest {

    Burger burger;

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    @BeforeEach
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void setBunsTest() {
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn("black bun");
        assertEquals("black bun", burger.bun.getName());

    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getName()).thenReturn("dinosaur");
        assertEquals("dinosaur", burger.ingredients.get(0).getName());

    }

    @Test
    public void removeIngredientTest() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        assertEquals(2, burger.ingredients.size());
    }

    @Test
    public void getPriceIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Mockito.when(bun.getPrice()).thenReturn((float) 20);
        Mockito.when(ingredient.getPrice()).thenReturn((float) 10);

        assertEquals(50, burger.getPrice());
    }

    @Test
    public void getReceiptIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);

        assertThat(burger.getReceipt(), containsString("==== black bun ===="));
    }
}
