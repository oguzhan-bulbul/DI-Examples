package com.ouz.pets;

public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dog";
    }
}
