package structurialternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative sau variabile locale = conditii
    //IF este o structura de control are este folosita pentru a evalua o conditie boolean si pt a executa un anumit
    // bloc de cod daca aceasta conditie este adevarata
    // if(conditia){
    //blocul de cod care se executa daca conditia e adevarata
    // } else{
    //blocul de cod care se executa daca conditia este falsa
    // }

    @Test
    public void MetodaDeTest() {
//        VerificareNumar(4);
//        VerificareNumar(-1);
//        VerificareNumar(0);
//        VerificareNumar(9);
//        VerificareNumar(-10);
        afisareZileSaptamana(8);
    }

    public void VerificareNumar(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul: " + numar + " este par pozitiv");
            } else {
                System.out.println("numarul: " + numar + " este impar pozitiv");
            }
        } else if (numar == 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul: " + numar + " este par negativ");
            } else {
                System.out.println("numarul: " + numar + " este impar negativ");
            }
        } else {
            System.out.println("numarul: " + numar + " este egal cu 0");
        }
    }

    // switch este o structura de control care permite evaluarea si executarea unuia dintre mai multe blocuri
// de cod infuctie de valoare
// switch (expresia de evaluat){
//      case valoare1 :
//          blocul de cod care se executa in cazul in care expresia are valoarea1
//          break;
// switch (expresia de evaluat){
//         case valoare2 :
//          blocul de cod care se executa in cazul in care expresia are valoarea2
//          break;
//  default:
//          blocul de cod care se executa in cazul in care nicunul din cazul de mai sus nu se potriveste
//          break;
    public void afisareZileSaptamana(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este ziua de Luni");
                break;
            case 2:
                System.out.println("Astazi este ziua de Marti");
                break;
            case 3:
                System.out.println("Astazi este ziua de Miercuri");
                break;
            case 4:
                System.out.println("Astazi este ziua de Joi");
                break;
            case 5:
                System.out.println("Astazi este ziua de Vineri");
                break;
            case 6:
                System.out.println("Astazi este ziua de Sambata");
                break;
            case 7:
                System.out.println("Astazi este ziua de Duminica");
                break;
            default:
                System.out.println(zi + " Aceasta nu este o zi a saptamanii");
        }
    }
}


