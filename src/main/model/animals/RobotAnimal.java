package main.model.animals;

import main.model.Food;
import main.model.humanoids.Humanoid;

import java.time.LocalDate;

public class RobotAnimal extends Animal{


    public RobotAnimal(String name, LocalDate birth, String favoriteToy, Food favoriteFood, boolean isHungry, Humanoid owner) {
        super(name, birth, favoriteToy, favoriteFood, isHungry, owner);
    }


    @Override
    public void eat() {
        System.out.println("Robots dont eat.");

    }

}
