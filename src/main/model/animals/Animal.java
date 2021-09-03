package main.model.animals;

import main.model.Food;
import main.model.humanoids.Humanoid;

import java.time.LocalDate;

public class Animal implements AnimalInterface {

    protected String name;
    protected LocalDate birth;
    protected String favoriteToy;
    protected Food favoriteFood;
    protected boolean isHungry;

    protected Humanoid owner;

    public Animal() {}

    public Animal(String name, LocalDate birth, String favoriteToy, Food favoriteFood, boolean isHungry, Humanoid owner) {
        this.name = name;
        this.birth = birth;
        this.favoriteToy = favoriteToy;
        this.favoriteFood = favoriteFood;
        this.isHungry = isHungry;
        this.owner = owner;
    }

    public Animal(String name, LocalDate birth, String favoriteToy, Food favoriteFood, Humanoid owner) {
        // TODO
    }

    @Override
    public void eat() {
        if( favoriteFood == Food.meal){
            System.out.println("The predator ate his meal");
        }else if (favoriteFood == Food.vegetable){
            System.out.println("The herbivorous ate his vegetabele");
        }else if (favoriteFood == Food.seeds){
            System.out.println("The bird ate his seeds");
        }else{
            System.out.println("The omnivorous ate his worms");
        }


    }

    @Override
    public void makeSound() {
        System.out.println("weird animal sound ");
    }

    @Override
    public void play() {
        System.out.println("playing with food");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Humanoid getOwner() {
        return owner;
    }

    public void setOwner(Humanoid owner) {
        this.owner = owner;
    }
}
