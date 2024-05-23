package main.java.com.megicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String firstName;
    private String lastName;
    private String email;
    private Pet pet;
    final private LocalDateTime reistrationDate = LocalDateTime.now();

    @Override
    public String toString() {
        return "Client {"
                + "\n\tfirstName = " + firstName
                + ", lastName = " + lastName
                + ", email = " + email
                + ",\n\tpet = " + pet
                + ", registrationDate = " + reistrationDate.format(FORMATTER)
                + "\n}";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
