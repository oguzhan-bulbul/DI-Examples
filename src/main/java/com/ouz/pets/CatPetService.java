package com.ouz.pets;



public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat";
    }
}
