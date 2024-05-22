package main.java.com.megicvet.service;

import main.java.com.megicvet.Main;
import main.java.com.megicvet.model.Cat;
import main.java.com.megicvet.model.Dog;
import main.java.com.megicvet.model.Pet;

public class PetService {

    private static String DOG_TYPE = "dog";
    private static String CAT_TYPE = "cat";

    public Pet registerNewPet(){
        Pet pet = null;

        System.out.print("Type (dog / cat): ");
        String type = Main.SCANNER.nextLine();

        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)){
            pet = buildPet(type);
        } else {
            System.out.println("Unknown pet type");
        }

        return pet;}

    private Pet buildPet(String type) {
        Pet pet = type.equals(CAT_TYPE) ? new Cat() : new Dog();
        pet.setType(type);

        System.out.print("Age: ");
        pet.setAge(Main.SCANNER.nextLine());

        System.out.print("Name: ");
        pet.setName(Main.SCANNER.nextLine());

        System.out.print("Sex (male / famale): ");
        pet.setSex(Main.SCANNER.nextLine());

        if (type.equals(DOG_TYPE)){
            System.out.println("Size(XS / S / M / L / XL): ");
            String size = Main.SCANNER.nextLine();
            ((Dog) pet).setSize(Dog.Size.valueOf(size));
        }

        return pet;
    }
}
