/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones;

import Salones.repetidos.Electrico;

/**
 *
 * @author Alex
 */
public class Sala {
    private String mesa;
    private String tv;
    private String sillas;
    private Electrico cableadoSala;
    private String sillones;

    public Sala() {
    }

    public Sala(String mesa, String tv, String sillas, Electrico cableadoSala, String sillones) {
        this.mesa = mesa;
        this.tv = tv;
        this.sillas = sillas;
        this.cableadoSala = cableadoSala;
        this.sillones = sillones;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSillas() {
        return sillas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }

    public Electrico getCableadoSala() {
        return cableadoSala;
    }

    public void setCableadoSala(Electrico cableadoSala) {
        this.cableadoSala = cableadoSala;
    }

    public String getSillones() {
        return sillones;
    }

    public void setSillones(String sillones) {
        this.sillones = sillones;
    }
    
    
    
}
