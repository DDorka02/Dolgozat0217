package com.ruander;

import com.ruander.alakzatok.FemAlakzat;

public class Gomb extends FemAlakzat {
    public double r= 4.188;

    public Gomb() {
        super();
    }

    public Gomb(double r) {
    }

    public double terfogat() {
        return Math.round(r)*Math.PI/3;
    }
}
