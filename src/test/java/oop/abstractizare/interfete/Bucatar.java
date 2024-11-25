package oop.abstractizare.interfete;

public class Bucatar implements Gatit{
    @Override
    public void pregatesteMancarea(String numeleMancarii) {
        System.out.println("Bucatarul pregateste:" + numeleMancarii);
    }
}
