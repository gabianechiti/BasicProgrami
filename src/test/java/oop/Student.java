package oop;

public class Student extends Persoana implements StudentInterface {

    private String facultate;
    private boolean bursa;
    private String cursuri;



    public Student(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Persoana: " +getNume() + " este student la Facultatea: " +facultate);
        System.out.println("Persoana: " +getPrenume() + " ia/nu ia " + bursa);
        System.out.println("Persoana: " +getNume() + " are cursuri de: " +cursuri);

    }
    // polimorfism dinamic
    @Override
    public void mananca() {
        System.out.println("Studentul manaca cand are timp");
        super.mananca();
    }

    public boolean isBursa() {
        return bursa;
    }

    public String getCursuri() {
        return cursuri;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }


    @Override
    public void mergeLaCursuri() {
        System.out.println("cand vrea");

    }

    @Override
    public void sustineExamene() {
        System.out.println("in sesiune");

    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("mereu");

    }
}
