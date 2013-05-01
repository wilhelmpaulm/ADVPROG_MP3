/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;

/**
 *
 * @author wilhe_000
 */
public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    
    public void clearAll(){
        contacts.clear();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void addContact(String name, String mobile, String landline, String email) {
        contacts.add(new Contact(name, mobile, landline, email));
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public ArrayList<Contact> searchName(String name) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public ArrayList<Contact> searchLastName(String name) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getLastName().equalsIgnoreCase(name)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public ArrayList<Contact> searchFirstName(String name) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public ArrayList<Contact> searchMobile(String mobile) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getMobile().equalsIgnoreCase(mobile)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public ArrayList<Contact> searchLandline(String landline) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getLandline().equalsIgnoreCase(landline)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public ArrayList<Contact> searchEmail(String email) {
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                cs.add(contact);
            }
        }
        return cs;
    }

    public String getContactsView() {
        String str = "No. of Contacts: " + contacts.size();

        for (Contact contact : contacts) {
            str += "\n\n" + contact.getContact() + "\n";
        }
        return str;
    }

    public String getAllContacts() {
        String str = "Entries:" + contacts.size();

        for (Contact contact : contacts) {
            str += "\n" + contact.getContact();
        }
        return str;
    }

    public String getAllContactsName() {

        String str = "Entries:" + contacts.size();
        for (Contact contact : contacts) {
            str += "\n" + contact.getName();
        }
        return str;
    }

    public String getAllSortedContactsName() {
        String str = "Entries:" + contacts.size();
        String[] names = new String[contacts.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = contacts.get(i).getName();
        }
        Arrays.sort(names);
        for (String string : names) {
            str += "\n" + string;
        }

        return str;
    }

    public String searchLetter(String letter) {
        String str = "Entries:" + contacts.size();
        
        ArrayList<Contact> cs = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getLastName().substring(0, 1).equalsIgnoreCase(letter)) {
                cs.add(contact);
            }
        }
        
        String[] names = new String[cs.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = cs.get(i).getName();
        }
        Arrays.sort(names);
        for (String string : names) {
            str += "\n" + string;
        }

        return str;
    }
}
