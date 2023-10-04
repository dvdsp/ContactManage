/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;


import java.util.ArrayList;
import java.util.Scanner;
import model.Contact;


/**
 *
 * @author DELL
 */
public class Library {
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
                                                + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

    public static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty() ) {
                System.out.print("Can not be empty. Let's try enter again:        ");     
            } else {
                return result;
            }
        }
    }

    
    public static int checkInputInt() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine().trim());
                return choice;
            } catch (NumberFormatException e) {
                System.out.print("*Invalid value(only type number). Try enter again:      ");
            }
        }
    }
    
    
    public static String checkInputPhoneNumber() {
        while (true) {
            String choice = checkInputString();
            if (choice.matches(VALID_PHONE)) {
                return choice;
            }
            System.out.println("\t*Please input format phone number follow*"
                                            + "• 1234567890\n"
                                            + "• 123-456-7890 \n"
                                            + "• 123-456-7890 x1234\n"
                                            + "• 123-456-7890 ext1234\n"
                                            + "• (123)-456-7890\n"
                                            + "• 123.456.7890\n"
                                            + "• 123 456 7890");
            System.out.print("Let's enter again:  ");
        }
    }
    
    
    public static int checkIdExist(ArrayList<Contact> contactList, int contactId) {
        for (Contact contact : contactList) {
            if (contactId == contact.getContactId() ) {
                return -1;
            }
        }
        return 0;
    }
    
    
    
   
    
    
    
    
}
