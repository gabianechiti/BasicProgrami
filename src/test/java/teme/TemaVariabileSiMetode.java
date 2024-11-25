package teme;

import com.beust.jcommander.IStringConverter;
import org.testng.annotations.Test;

public class TemaVariabileSiMetode {

    //Casa: detalii: nr camere, nume camere etc
    //min 3 variabile globale ok
    //min 3 variabile locale in oricare metoda (void sau return)
    //2 metode cu void    - o metoda cu parametru
    //- o metoda fara paramentru
    //2 metode cu return - o metoda cu parametru
    //- o metoda fara parametru
    //o metoda de test unde sa afisam sout toate variabilele si metodele pe care le-am
    //lucrat

    //tema 16.10.2024
    // hashMap2 cu char si string, liste, de parcurs cu for
    //cu masini din tari diferite
    // 4 perechi in hashMap2
    //dintr o lista de stringuri cautati un string tinta/dorit, trebuie sa facem o lista de stringuri, apoi o
    // variabila de tip string ca re sa fie cuvantul pe care il caut (pere mere si cirese- cuvantul tinta
    // trebuie sa fie cirese) si cand ajungem la cuvantul dorit 9cu for sau while) sa l printam in consola
    //avem nevoie de if: indexul ajunge la cuvantul dorit, indexul se printeaza


    //variabile globale/de instanta folosite: string;int
    String numeCasa = "Gabriela";
    int numarCamere = 3;
    String suprafata = "100m2";
    String numeCamera1 = "Bucatarie";
    String numeCamera2 = "Living";
    String numeCamera3 = "Dormitor";
    double inaltimeCasa =4.5;
    String salutdebunvenit="Bine ai venit!";




    @Test
    public void afisareTemaVariabileSiMetode(){
        System.out.println("Numele casei este: " + numeCasa);
        System.out.println("Cate camere are casa: " + numarCamere);
        System.out.println("Ce suprafata are casa: " + suprafata);
        System.out.println("Ce nume au camerele casei: "+ numeCamera1 +", "+numeCamera2 +", "+numeCamera3);

    }

    @Test
    public void afisareDetaliiCasa() {
        double inaltimeCasa =4.5;
        System.out.println("Inaltimea casei este de: " + inaltimeCasa + " m");

    }
    @Test
    public void afiseazaSalutDeBunvenit(){
        String salutdebunvenit="Bine ai venit!";
    System.out.println("Salutul de bun venit este: " +salutdebunvenit);

}
    @Test
    public void afiseazaMesajStandard(){
        System.out.println("Welcome");

    }
   @Test
    public void afiseazadetalii(){
        System.out.println("Cand cineva vine in vizita: " +salutdebunvenit);
    }
}



