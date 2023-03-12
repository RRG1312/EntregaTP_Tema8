package org.example;

import java.util.Random;

public class Dado {
    int caras;
    int ultimaCara;
    public Dado(int caras) {
        this.caras = caras;
        ultimaCara =-1;
    }
    public Dado() {
        this.caras = 6;
        ultimaCara=-1;
    }

    public int getCaras() {
        return caras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }
    public int tirarDados(){
        Random r  = new Random();
        int tirada = r.nextInt(this.caras)+1;
        this.ultimaCara=tirada;
        return tirada;
    }
}
