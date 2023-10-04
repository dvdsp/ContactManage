/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author DELL
 */
public interface InterfaceContactRepository {
    
    void addContact(ArrayList<Contact> contactList);
    void deleteContact(ArrayList<Contact> contactList);
    void displayContact(ArrayList<Contact> contactList);
    
}
