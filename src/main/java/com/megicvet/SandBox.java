package main.java.com.megicvet;


import main.java.com.megicvet.model.Cat;
import main.java.com.megicvet.model.Client;
import main.java.com.megicvet.model.Dog;
import main.java.com.megicvet.model.Pet;

public class SandBox {
    public static void main(String[] args) {

        Dog o1 = new Dog(Dog.Size.M);
        Dog o2 = new Dog(Dog.Size.M);

        o1.setSex("male");
        o1.setOwnerName("Max");
        o1.setName("AAA");
        o1.setAge("11");
        o1.setType("dog");
        o2.setType("dog");
        o2.setAge("11");
        o2.setName("AAA");
        o2.setSex("male");
        o2.setOwnerName("Max");

        System.out.println(o1.equals(o2));
        System.out.println("O1 -" + o1.hashCode());
        System.out.println("O2 -" + o2.hashCode());
    }
}
