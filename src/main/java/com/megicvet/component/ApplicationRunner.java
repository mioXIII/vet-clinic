package main.java.com.megicvet.component;

import main.java.com.megicvet.Main;
import main.java.com.megicvet.model.Client;
import main.java.com.megicvet.model.Pet;
import main.java.com.megicvet.service.ClientService;
import main.java.com.megicvet.service.PetService;

public class ApplicationRunner {

    private ClientService clientService = new ClientService();
    private PetService petService= new PetService();


    public void run() {
        if (Authenicator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null) {

                //checking the need to create a pet

                System.out.print("Wish you to add pet? (y/n): ");
                String answear = Main.SCANNER.nextLine();

                if (answear.equals("y")) {

                System.out.println("Adding a new pet.");

                Pet pet = petService.registerNewPet();

                if (pet != null){
                client.setPet(pet);
                pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                System.out.println("Pet has been added.");
                }
                System.out.println(client);
                }
                else if (answear.equals("n")) {
                    System.out.println("New client has benn added: " + client);
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

}

