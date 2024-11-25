package oop;

public class StudentAngajat extends Persoana implements StudentInterface, AngajatInterface{

    private String Companie;
    private String profesie;
    private int vechime;

    private String facultate;
    private boolean bursa;
    private String cursuri;

    public StudentAngajat(String nume, String prenume, int varsta, String companie, String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
        this.Companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }


    @Override
    public void mergeLaMunca() {
        System.out.println("in fiec zi");

    }

    @Override
    public void munceste() {
        System.out.println("In fiec zi");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("in fiec luna");

    }

    @Override
    public void isiDaDemisia() {
        System.out.println("cand se satura");

    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("in fiec zi");

    }

    @Override
    public void sustineExamene() {
        System.out.println("in sesiune");

    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("in fiec seara");

    }
}
