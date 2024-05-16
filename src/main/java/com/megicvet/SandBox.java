package main.java.com.megicvet;

import main.java.com.megicvet.comparator.DogSizeComparator;
import main.java.com.megicvet.model.Dog;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SandBox {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.M),
                new Dog(Dog.XS),
                new Dog(Dog.M),
                new Dog(Dog.S),
                new Dog(Dog.XL),
                new Dog(Dog.L),
        };

        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog: dogs){
            System.out.println(dog.getSize());
        }
    }
}
