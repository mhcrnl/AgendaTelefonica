/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica.AgendaTelefonicaV01;

import agendatelefonica.Agenda;
import java.io.Console;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mhcrnl
 */
public class AdaugareAngajatV01 {
    public static void main(String[] args) {
        String nume = " ";
        long tel;
        Scanner in = new Scanner(System.in);
        Agenda a = null;
        ArrayList<Agenda> al = new ArrayList<Agenda>();
        //Adaugarea unui meniu pt a face functional programul
        int meniu =0;
        while(meniu != 3) {
            String msg = "Introduce-ti:\n 1 Adaugare\n 2 Salvare\n 3 Inchidere";
            JOptionPane.showMessageDialog(null,msg);
            meniu = in.nextInt();
            if(meniu == 1){
                System.out.println("Introduceti numele Cotactului: ");
                String msg1 = "Introduceti numele Cotactului: ";
                //in.next();// asteapta introducerea de la consola a numelui
                try {
                    nume = JOptionPane.showInputDialog(null, msg1);
                    //nume = in.nextLine();
                } catch (Exception e){ e.printStackTrace();}
                System.out.println("Ati introdus numele: " +nume);
                System.out.println("Numarul de telefon: ");
                tel = Long.parseLong(in.nextLine());//in.nextLong();
                a = new Agenda(nume, tel);
                al.add(a);
            }
            if(meniu == 2){
                try {
                    FileOutputStream fos = new FileOutputStream("agendav01.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(al);
                    oos.close();
                    fos.close();
                    System.out.println("Persoana a fost adaugata!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
       
        System.out.println("Am iesit din program!");
        System.out.println("Adaugat: " +al );
        System.exit(0);
        
        
        
        
        
    }
    
}
