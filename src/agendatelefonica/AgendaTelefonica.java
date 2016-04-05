/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author mhcrnl
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda a =null;
        try {
            FileInputStream fis = new FileInputStream("agenda.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a =(Agenda) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println("Afisarea persoanelor din agenda!");
        System.out.println("Nume/Prenume: "+ a.getNume());
        System.out.println("Nr telefon: "+a.getTel());
                
    }
    
}
