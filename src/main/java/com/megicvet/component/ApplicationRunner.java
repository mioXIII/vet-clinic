package main.java.com.megicvet.component;

import main.java.com.megicvet.Main;
import main.java.com.megicvet.model.Client;
import main.java.com.megicvet.model.Pet;
import main.java.com.megicvet.service.ClientService;
import main.java.com.megicvet.service.PetService;

public class ApplicationRunner {

    final private EntityRegister register = new EntityRegister();

    public void run() {
        if (Authenicator.auth()) {
            register.registerClients();
        }
    }




}
