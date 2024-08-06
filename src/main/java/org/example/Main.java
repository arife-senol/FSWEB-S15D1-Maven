package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        Contact contact = new Contact("Test", "12345678");
       MobilePhone mobilePhone = new MobilePhone("11111111", contacts);
        mobilePhone.addNewContact(new Contact("Test", "12345678"));
        System.out.println(mobilePhone.removeContact(contact)); //true
        System.out.println(mobilePhone.getMyContacts().size());
    }
}
