/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.io.Serializable;

/**
 *
 * @author mhcrnl
 */
public class Agenda implements Serializable {
    private String nume;
    private long tel;
    
    public Agenda(String nume, long tel){
        this.nume = nume;
        this.tel = tel;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the tel
     */
    public long getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(long tel) {
        this.tel = tel;
    }
    
    
}
