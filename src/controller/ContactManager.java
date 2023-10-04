/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import Repository.ContactRepository;
import Repository.InterfaceContactRepository;
import common.Library;
import java.util.ArrayList;
import model.Contact;
import view.Menu;

/**
 *
 * @author DELL
 */
public class ContactManager extends Menu<String> {
    
    static String[] mc = {"Add a contact", "Display All Contacts ", "Delete a contact", "exit"};
    protected ArrayList<Contact> contactList ;
    protected InterfaceContactRepository contactRepository;
    
    Library valid ;
    
    public ContactManager() {
        super("\n\tCONTACT MANAGE \t", mc);
        contactList = new ArrayList<>();
        valid = new Library();
        contactRepository = new ContactRepository();
        //demostration 
        contactList.add(new Contact(1, "Iker Casillas", "Real Marid", "Spain","1234567890", "Iker","Casillas" ));
        contactList.add(new Contact(2, "David DeGea", "free player", "the UK","1234567890", "David","Degea" ));
        contactList.add(new Contact(3, "Lionel Messi", "Inter Miami ", "the US","1234567890", "Messi","Lionel" ));
    }
    
    
    @Override
    public void execute(int choice) {
        switch (choice) {
       
            case 1-> contactRepository.addContact(contactList);
            case 2-> contactRepository.displayContact(contactList); 
            case 3-> contactRepository.deleteContact(contactList);
            case 4-> System.exit(0);
        }
    }

    
    
    
 
    
}
