package org.example;

public class DishStack {

    private static final int DEFAULT_CAPACITY = 10;

    private Dish[] stack; 
    private int top;    

    public DishStack() {
        this(DEFAULT_CAPACITY);
    }

    public DishStack(int capacity) {
        stack = new Dish[capacity];
        top = 0; 
    }

    public void push(Dish dish) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push another dish.");
            return; 
        }
        stack[top] = dish;
        top++;
    }

    public Dish pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        top--;
        Dish removed = stack[top];
        stack[top] = null;
        return removed;
    }

    public Dish peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek at.");
            return null;
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == stack.length;
    }
}
