package variabilesiMetode;

import org.testng.annotations.Test;

public class Persoana {


    //o clasa in java este o structura care defineste atat atributele cat si metodele unui obiect
    //tipuri de date in java:
    //1. primitive(stocheaza direct valorile in variabila si sunt prestabilite)
    //a. int - numere intregi (32 biti)
    //b. double - numere zecimale
    //c. char - caractere individuale (a) se foloseste o singura ghilimea si intainte si dupa valoare
    //d. boolean - valori true or false
    //e. byte - numere intregi (8)
    //f. short - numere intregi (16)
    //g. long - numere intregi (64)
    //h. float - numere zecimale dar precizia este mai mica decat la double
    //2. Tipuri de referinta : stocheaza doar referinta catre un obiect
    //a. string:sir de caractere
    //b. Integer: o clasa care invaluieste/wraper un int

    //variabile globale/instanta
    String nume="Popescu";    //viaribila globala de tip string
    String prenume="Ion";     //variabila globala de tip string
    char sexul='M';            //variabila globala de tip char
    int anulNasterii=2004;   //vriabila globala de tip int


    @Test
    public void afisarePersoana(){
        System.out.println("Numele persoanei este: "+nume);
        System.out.println("Prenumele persoanei este: "+prenume);
        System.out.print("AnulNasterii persoanei este: "+anulNasterii+ " sexul este: "+sexul);
    }

    @Test
    public void afisareDetaliiPersoana(){
        double inaltime=1.80;
        int greutate=80;
        System.out.println("Persoana are intaltimea de: " +inaltime);
        System.out.println("Greutatea Persoanei este de: " +greutate);
        System.out.println("Numele persoanei este: "+nume+" Persoana are intaltimea de: " +inaltime);
    }

    //o metoda este un bloc de cod care indeplineste o functie specifica
    //metodele sunt de 2 tipuri: void sau return
    //void inseamna ca nu returneaza nimic
    //return returneaza un tip de date: int, string sau boolean:
    // in loc de public void va fii public int sau public string iar la sfarsit inainte de ultima
    // acolada,
    // trebuie sa fie un return, iar aceste trebuie sa returneze aceeasi valoare
    // declarata initital: string sau int, etc.


    public int calculVarsta(){
        return 2018-anulNasterii;
    }

    public boolean esteAdult(int varsta){
        return varsta>18;
    }

    @Test
    public void afisareDatePersoana(){
        int varstaReala=calculVarsta();
        System.out.println("varsta calculata a persoanei este de: " +calculVarsta()+" ani");
        System.out.println("persoana este adult? "+esteAdult(varstaReala));

    }



}

