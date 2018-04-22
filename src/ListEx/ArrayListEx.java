/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class ArrayListEx {
    public static void main(String[] args) {
        //adaugarea elementelor in lista
        String element = "element", elemente = null;
        List listDeInt = new ArrayList();
        for(int i=0; i<=10; i++){
            listDeInt.add(element +i);
        }
        System.out.println("Elementele din Lista: "+ listDeInt);
        //citirea elementelor din lista
        for(Object e: listDeInt){
            System.out.println("Elemente: " + e.toString());
        }
        //Parcurgerea listei cu iterator
        Iterator it = listDeInt.iterator();
        while(it.hasNext()){
            elemente = (String) it.next();
            System.out.println(elemente);
        }
        //Object element3;
        //System.out.println("Elementele cu iterator: "+ it.next().toString());
        listDeInt.remove(3);
        listDeInt.remove(4);
        Iterator it1 = listDeInt.iterator();
        while(it1.hasNext()){
            element =(String) it1.next();
            System.out.println("Elemente dupa stergere: "+element);
        }
    }
    
}
