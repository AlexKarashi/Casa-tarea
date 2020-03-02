/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salones.repetidos;

/**
 *
 * @author Alex
 */
public class Electrico {
    private int focos;
    private int noDeContactos;

    public Electrico() {
    }

    public Electrico(int focos, int noDeContactos) {
        this.focos = focos;
        this.noDeContactos = noDeContactos;
    }

    public int getFocos() {
        return focos;
    }

    public void setFocos(int focos) {
        this.focos = focos;
    }

    public int getNoDeContactos() {
        return noDeContactos;
    }

    public void setNoDeContactos(int noDeContactos) {
        this.noDeContactos = noDeContactos;
    }

   
}
