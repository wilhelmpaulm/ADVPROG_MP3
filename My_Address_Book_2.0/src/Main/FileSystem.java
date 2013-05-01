/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author wilhe_000
 */
public class FileSystem {

    public void createSaveFile(AddressBook addressBook) {
        try {
            
            FileOutputStream saveFile = new FileOutputStream("Save Files/save.txt");
            byte[] b = addressBook.getAllContacts().getBytes();
            saveFile.write(b);
            saveFile.flush();
            saveFile.close();

        } catch (Exception exc) {
            exc.printStackTrace();

        }
    }
    
       public void createbackUpSaveFile(AddressBook addressBook) {
        try {
            
            FileOutputStream saveFile = new FileOutputStream("Save Files/backup_save.txt");
            byte[] b = addressBook.getAllContacts().getBytes();
            saveFile.write(b);
            saveFile.flush();
            saveFile.close();

        } catch (Exception exc) {
            exc.printStackTrace();

        }
    }
       
    public void createSaveVarFile(AddressBook addressBook) {
        String path = "";
        try {
            
            final JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(null);
        
            if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            path = file.getPath();
            
            } else {

            }
            
            FileOutputStream saveFile = new FileOutputStream(path);
            byte[] b = addressBook.getAllContacts().getBytes();
            saveFile.write(b);
            saveFile.flush();
            saveFile.close();

        } catch (Exception exc) {
            exc.printStackTrace();

        }
    }

    public void readSaveFile(String file) {
        try {
            Scanner s = new Scanner(new FileReader(file));
            loadSaveFile(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadSaveFile(Scanner scanner) {
        int cycles = Integer.parseInt(scanner.nextLine().split(":")[1]);
        System.out.println(cycles);
        for (int i = 0; i <= cycles-1; i++) {
            
            Driver.addressBook.addContact(
                    (scanner.nextLine() + " ").split(":")[1].trim(),
                    (scanner.nextLine() + " ").split(":")[1].trim(),
                    (scanner.nextLine() + " ").split(":")[1].trim(),
                    (scanner.nextLine() + " ").split(":")[1].trim());
        }
//        (scanner.nextLine() + " ").split(":")[1]
    }
}
