/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import UI.MainUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author wilhe_000
 */
public class Driver {
    
    public static FileSystem fileSystem = new FileSystem();
    public static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {

          try {        
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
//          
//          addressBook.addContact("sa,poop", "boom", "sdasd", "asdasd");
//          addressBook.addContact("b,ang", "boom", "sdasd", "asdasd");
//          addressBook.addContact("maa.,m", "boom", "sdasd", "asdasd");
//          addressBook.addContact("b,ang", "boom", "sdasd", "asdasd");
//          addressBook.addContact("ban,g", "boom", "sdasd", "asdasd");
//          
//          fileSystem.createSaveFile(addressBook);

          fileSystem.readSaveFile("Save Files/save.txt");
          
          System.out.println(addressBook.getAllContacts());
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainUI().setVisible(true);
            }
        });

    }
    
    
}
