package com.somelier.model;

import java.util.ArrayList;

public class Vins {

    private String marca;
    private String tipus;
    private ArrayList<Vins> Vinacoteca;

    public Vins(String marca, String tipus) {
        this.marca = marca;
        this.tipus = tipus;
    }


    // Getters
    public String getmarca() {
        return marca;
    }

    public String gettipus() {
        return tipus;
    }


    // Setters
    public void setmarca(String marca) {
        this.marca = marca;
    }


    public void settipus(String tipus) {
        this.tipus = tipus;
    }

    public void main(String[] args) {
        Vinacoteca = new ArrayList();
        Vins v1 = new Vins("Familia Torres","negre");
        Vins v2 = new Vins("Catena","negre");
        Vins v3 = new Vins("Vega Sicilia","rosat");
        Vins v4 = new Vins("Henschke","blanc");
        Vins v5 = new Vins("Concha y Toro","rosat");
        Vins v6 = new Vins("Penfolds","negre");
        Vins v7 = new Vins("Domaine de la Romanée-Conti","rosat");
        Vins v8 = new Vins("CVNE","blanc");
        Vins v9 = new Vins("Antinori","blanc");
        Vins v10 = new Vins("Château Musar","negre");
        Vins v11 = new Vins("E. Guigal","rosat");
        Vins v12 = new Vins("Château Lafite","rosat");

        System.out.println(Vinacoteca);

    }
}



