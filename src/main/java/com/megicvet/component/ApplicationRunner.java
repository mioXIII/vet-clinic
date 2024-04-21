package main.java.com.megicvet.component;

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
                System.out.println("Adding a new pet.");

                Pet pet = petService.registerNewPet();
                client.setPet(pet);
                pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                System.out.println("Pet has been added.");

            }
        }
    }

}

