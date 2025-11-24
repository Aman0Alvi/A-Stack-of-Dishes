package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishStackTest {

    @Test
    void newStackHasSizeZero() {
        DishStack stack = new DishStack();
        assertEquals(0, stack.size());
    }

    @Test
    void pushIncreasesSizeAndPeekShowsTop() {
        DishStack stack = new DishStack();
        Dish one = new Dish("one");
        Dish two = new Dish("two");

        stack.push(one);
        stack.push(two);

        assertEquals(2, stack.size());
        assertEquals("two", stack.peek().description); 
    }

    @Test
    void popReturnsItemsInLifoOrderAndDecreasesSize() {
        DishStack stack = new DishStack();
        Dish red = new Dish("red");
        Dish blue = new Dish("blue");

        stack.push(red);
        stack.push(blue);

        Dish firstPopped = stack.pop();
        Dish secondPopped = stack.pop();

        assertEquals("blue", firstPopped.description);
        assertEquals("red", secondPopped.description);
        assertEquals(0, stack.size());
    }

    @Test
    void popOnEmptyStackReturnsNull() {
        DishStack stack = new DishStack();
        assertNull(stack.pop());
    }

    @Test
    void peekOnEmptyStackReturnsNull() {
        DishStack stack = new DishStack();
        assertNull(stack.peek());
    }
}
