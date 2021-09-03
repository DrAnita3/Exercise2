package main.model.humanoids;

import main.model.animals.Animal;

public interface HumanoidInterface {

    void getNewPet(Animal animal);

    void feedPets();

    void renamePet(Animal animal, String newName);

}
