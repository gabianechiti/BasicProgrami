package oop;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Angajat extends Persoana implements AngajatInterface {

    private String Companie;
    private String profesie;
    private int vechime;

    public Angajat(String nume, String prenume, int varsta, String companie, String profesie, int vechime){
        super(nume, prenume, varsta);
        this.Companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Angajatul: " +getNume() +" lucreaza la compania: " +Companie);
        System.out.println("Angajatul: " +getNume() +" are profesia: " +profesie);
        System.out.println("Angajatul: " +getNume() +"  are vechimea: " +vechime +" ani");
    }
    public void mananca(){
        System.out.println("angajatul mananca in pauza de masa");
        super.mananca();
    }
    public void programLucru(){
        System.out.println("Angajatul liucreaza 8 ore stadanrd");
    }
    public void programLucru(int numarOre){
        System.out.println("Angajatul part time lucreaza: " +numarOre + " ore");
    }
    public void programLucru(String locatie){
        System.out.println("testerul lucreaza: " + locatie);
    }
    public void programLucru(boolean lucreazaInWeekend){
        System.out.println("Angajatul disperat lucreaza/nu lucreaza in weekend: " + lucreazaInWeekend);
        
    }

    public String getCompanie() {
        return Companie;
    }

    public void setCompanie(String companie) {
        Companie = companie;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public String getProfesie() {
        return profesie;
    }

    public void setProfesie(String profesie) {
        this.profesie = profesie;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("angajatul merge la lucru");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste prea mult");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Insuficient");
    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Este o buna idee");

    }
}

