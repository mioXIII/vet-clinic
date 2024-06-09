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
    private Location location;

    @Override
    public String toString() {
        return "Client {"
                + "\n\tfirstName = " + firstName
                + ", lastName = " + lastName
                + ", email = " + email
                + ", location = " + location
                + ",\n\tpet = " + pet
                + ", clientRegistrationDate = " + reistrationDate.format(FORMATTER)
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

    public Pet getPets() {
        return pet;
    }

    public void setPets(Pet pet) {
        this.pet = pet;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public enum Location{
        KYIV, LVIV, ODESA
    }
}
