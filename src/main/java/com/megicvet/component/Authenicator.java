package main.java.com.megicvet.component;


import main.java.com.megicvet.Main;

public class Authenicator {

    private static String PASSWORD = "d";
    public static boolean auth() {
        boolean accepted = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = Main.SCANNER.nextLine();

            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password.");
            }
        }
        System.out.println(accepted ? "Welcome to the Magik Vet!" : "Application has been blocked.");

        return accepted;
    }
}
