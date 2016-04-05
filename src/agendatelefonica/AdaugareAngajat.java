/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author mhcrnl
 */
public class AdaugareAngajat {
    public static void main(String[] args) {
        Agenda a = new Agenda("Mihai Cornel", 722270796);
        
        try {
            FileOutputStream fos = new FileOutputStream("agenda.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
            fos.close();
            System.out.println("Persoana a fost adaugata!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}
