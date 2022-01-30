package com.devmvk.mobilephone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static final Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> mobileContacts = new ArrayList<>();

    public ArrayList<Contact> getMobileContacts() {
        return mobileContacts;
    }

    public void addContact(){
        System.out.println("Enter contact name : ");
        String name = scanner.nextLine();

        System.out.println("Enter 10 digit contact number : ");
        Long number = scanner.nextLong();

        Contact newContact = new Contact(name, number);
        getMobileContacts().add(newContact);
    }

    public void showContacts(){
        for (int i = 0; i < getMobileContacts().size(); i++) {
            Contact contact = getMobileContacts().get(i);
            System.out.println(contact.getContactName() + "    " + contact.getContactNumber());
        }
    }
}
