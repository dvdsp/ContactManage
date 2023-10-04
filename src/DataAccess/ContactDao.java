/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import common.Library;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author DELL
 */
public class ContactDao {
    private static ContactDao instance = null;
    public static ContactDao Instance() {
        if (instance == null) {
            synchronized (ContactDao.class) {
                if (instance == null) {
                    instance = new ContactDao();
                }
            }
        }
        return instance;
    }
    
    
    public void createContact(ArrayList<Contact> contactList) {
        System.out.print("Enter contact ID:   ");
        int contactId = Library.checkInputInt();
        
        System.out.print("Enter your first name:    ");
        String firstName = Library.checkInputString();
        System.out.print("Enter your last name:   ");
        String lastName = Library.checkInputString();
        System.out.print("Enter group:    ");
        String group = Library.checkInputString();
        System.out.print("Enter address:  ");
        String address = Library.checkInputString();
        System.out.print("Enter phone number:     ");
        String phone = Library.checkInputPhoneNumber();
        
        contactList.add( new Contact(contactId, firstName + lastName , group, address, phone, firstName, lastName));
        System.out.println("*Add new Contact successfully!");
    }
    
    public void printAllContact(ArrayList<Contact> contactList) {
         System.out.format("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", 
                        "Id", "Name", "First name", "Last name", "Group", "Address", "Phone");
        for(Contact contact : contactList) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone() );
        } 
    }
    
    public void deleteContact(ArrayList<Contact> contactList) {
        System.out.print("Enter contact id want to delete:    ");
        int contactId = Library.checkInputInt();
        Contact deleteContact = getContactById(contactList, contactId);
        if (deleteContact == null) {
            System.out.println("*Not found contact Id in the list*");
            return;
        } else {
            contactList.remove(deleteContact);
        }
        
    }
    
    public Contact getContactById(ArrayList<Contact> contactList,int contactId) {
        for (Contact contact : contactList) {
            if (contact.getContactId() ==  contactId) {
                return contact;
            }
        }
        return null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
