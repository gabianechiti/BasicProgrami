package oop.abstractizare.interfete;

public class Chelner implements Serveste, Curata{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul: " +numarMasa);
    }

    @Override
    public void servesteMancare(int numarComanda, String tipMancare) {
        System.out.println("Chelnerul serveste la comanda cu numarul: "+numarComanda + "mancarea este: " +tipMancare);
    }
}
