package wsi.exec.model;

import lombok.Data;

@Data
public class Bee {
    private int strength;   //strength + capacity == 100
    private int capacity;
    private int food;
    private BeePlace location;

    //konstruktor ustawiający początkowe wartości pszczoły
    public Bee() {
        strength = 50;
        capacity = 50;
        food = 0;
    }

    // konstruktor ustawiający sile i pilnujący by suma sily i pojemnosci byla rowna 100

    public void setStrength(int strength) {
        if (strength<0) strength = 0;
        if (strength>100) strength = 100;
        this.strength = strength;
        this.capacity = 100 - this.strength;

    }

    public void setCapacity(int capacity) {
        if (capacity<0) capacity = 0;
        if (capacity>100) capacity = 100;
        this.capacity = capacity;
        this.strength = 100 - this.capacity;
    }

    public void setFood(int food) {
        if (food<0) food = 0;
        if (food>100) food = 100;
        if(food>capacity) food = capacity;
        this.food = food;


    }

    public boolean validate() {
        return ((strength + capacity == 100) && (strength >= 0) &&
                (capacity >= 0) && food >= 0 && food <= capacity);
    }

}
