package main.java.com.megicvet.service;

import main.java.com.megicvet.Main;
import main.java.com.megicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {

    final private static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    final private static String FIRST_NAME_PATTERN = "^[A-Za-z-]{3,}";
    final private static String LAST_NAME_PATTERN = "^[A-Za-z-]{3,}";

    public Client registerNewClient() {
        Client client = null;

        System.out.println("Please provide client details.");
        System.out.print("Email: ");
        String email = Main.SCANNER.nextLine();

        if (isEmailValid(email)) {
            client = buildClient(email);
            System.out.println("New client: " + client.getFirstName() + " " + client.getLastName() + " "
                    + " (" + client.getEmail() + ")");
        } else {
            System.out.println("Provided email is invalid.");
        }

        return client;
    }

    private static Client buildClient(String email) {
        Client client = new Client();
        String firstName = "";
        String lastName = "";
        client.setEmail(email);

        // first name validation

        while (!isLastNameValid(firstName)) {
            System.out.print("First name: ");
            firstName = Main.SCANNER.nextLine();
            if (!isFirstNameValid(firstName)) {
                System.out.println("Invalid first name. Name must contain minimum 3 letters. Try again.");
            }
        }
        client.setFirstName(firstName);

        // last name validation

        while (!isLastNameValid(lastName)) {
            System.out.print("Last name: ");
            lastName = Main.SCANNER.nextLine();
            if (!isLastNameValid(lastName)) {
                System.out.println("Invalid last name. Name must contain minimum 3 letters.Try again.");
            }
        }
        client.setLastName(lastName);

        System.out.print("Location: ");

        Client.Location location;
        String locationInput = Main.SCANNER.nextLine();
        try {
            location = Client.Location.valueOf(locationInput);
        } catch (IllegalArgumentException e) {
            location = Client.Location.UNKNOWN;
            System.out.println("Unable to parse value '" + locationInput
                    + "'. Using default value: " + Client.Location.UNKNOWN);
        }
        client.setLocation(location);

        return client;

    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();

    }

    private static boolean isFirstNameValid(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();

    }

    private static boolean isLastNameValid(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }

}
