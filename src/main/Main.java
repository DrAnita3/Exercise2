package main;

import main.model.animals.Animal;
import main.model.humanoids.Human;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        human.getNewPet(animal1);
        human.getNewPet(animal2);
        human.getNewPet(animal3);


        // TODO
    }
}
