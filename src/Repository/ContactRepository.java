/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.ContactDao;
import java.util.ArrayList;
import model.Contact;



/**
 *
 * @author DELL
 */
public class ContactRepository implements InterfaceContactRepository {
    
    @Override
    public void displayContact(ArrayList<Contact> contactList) {
        ContactDao.Instance().printAllContact(contactList);
    }

    @Override
    public void addContact(ArrayList<Contact> contactList) {
        ContactDao.Instance().createContact(contactList);
    }

    @Override
    public void deleteContact(ArrayList<Contact> contactList) {
       ContactDao.Instance().deleteContact(contactList);
    }

    

    

    
    
    
   

    
}
