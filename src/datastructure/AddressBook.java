package datastructure;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비었습니다.");

        } else {
            for (Contact contact : contacts) {
                contact.display();
            }
        }

    }

    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.display();
                found = true;
            }
        }
        if (found) {
            System.out.println("검색이 완료되었습니다.");
        } else {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}