package com.cnss.main.tp4;

public class ChombreDouble extends Chombre{
    public int nombreLits;

    public ChombreDouble(int numero, boolean containsBalcon, boolean containsTV, int nombreLits) {
        super(numero, containsBalcon, containsTV);
        this.nombreLits = nombreLits;
    }
}
