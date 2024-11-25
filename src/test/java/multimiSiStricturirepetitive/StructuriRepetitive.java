package multimiSiStricturirepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    //Structurile repetivie sunt blocuri de cod si parcurg un anumit interval de valori
    //for, while,foreach
    //in java un array (multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip
    // (primitive sau de referinta)
    //un array are o deimensiune fixa, odata creea nu se mai poate schimba dimensiunea

    @Test
    public void afisateDate() {
//        colegiDeCursArray();
//        colegideCursLista();
        exempluHashmap1();
        exempluHashmap2();
    }

    public void colegiDeCursArray() {
        String[] colegi = new String[7];
        colegi[0] = "Senty";
        colegi[1] = "Edi";
        colegi[2] = "Gabi";
        colegi[3] = "Ionut";
        colegi[4] = "Ramona";
        colegi[5] = "Mihai";
        colegi[6] = "Andreea";

        //for (initializarea; conditie; increment){
        //in interior se va executa un bloc de cod in mod repetat
        //}
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului de la numarul: " + index + " este: " + colegi[index]);
        }
    }

    //listele sunt o colectie ordonata de elemente si fiecare element poate fi accesat printr un index numeric
    //elementele intro lista sunt adaugate in ordinea in care sunt adaugate
    //ca implemtare se foloseste Arraylist

    public void colegideCursLista() {
        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Senty");
        colegiLista.add("Edi");
        colegiLista.add("Gabi");
        colegiLista.add("Ionut");
        colegiLista.add("Ramona");
        colegiLista.add("Mihai");
        colegiLista.add("Andreea");
        colegiLista.add("Fabian");

        //while este o structura de comntrol utilizata pentru a se excuta un bloc de cod atata timp cat o conditie este
        // adevarata
        //index
        //while(conditia){
        //bloc de cod care se executa daca cinditia este adevarata
        //}
        //index++
        //}

        int index = 0;
        while (index < colegiLista.size()) {
            System.out.println("Numele colegului este: " + colegiLista.get(index));
            index++;
        }

        //hashmap este o implementare a unei colecii de tip pereche (cheie/valoare)
        //fiecare element din hashmap este o pereche foarmata din cheie si valoare
        //cheile sunt unice, nu pot fi duplicate
    }
        public void exempluHashmap1 (){
            HashMap<String, String> categoriiLucruri = new HashMap<>();
            categoriiLucruri.put("Flori","Trandafir");
            categoriiLucruri.put("Fructe","Para");
            categoriiLucruri.put("Legume","Cartofi");
            categoriiLucruri.put("Condimente","Sare");

            //foreach este o structura alternativa mai avansata a unui for
            //se poate utiliza sa interma orintr o colectie fara sa fie nevoie sa se utilizeze un index
            //ca si structura se declara : foreach(tipul de element "adica un String "si numele lui: colectia pe
            //care merge
            //{bloul de cod care se executa repetat poentru fiecare colectie
            //}

            for (String key:categoriiLucruri.keySet()){
                System.out.println("Categoria este: " + key + " obiectul din categoria este: " + categoriiLucruri.get(key));
            }
        }

        public void exempluHashmap2(){
        HashMap<String, List <String>> tariSiOrase = new HashMap <>();

        List<String> oraseRomainia = new ArrayList<>();
        oraseRomainia.add("Cluj");
        oraseRomainia.add("Timisoara");
        oraseRomainia.add("Bucuresti");
        oraseRomainia.add("Brasov");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Girona");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Trino");
        oraseItalia.add("Torino");

        List<String> oraseGermania = new ArrayList<>();
        oraseGermania.add("Berlin");
        oraseGermania.add("Bremen");
        oraseGermania.add("Koln");
        oraseGermania.add("Dusseldorf");

            tariSiOrase.put("Romania", oraseRomainia);
            tariSiOrase.put("Spania", oraseSpania);
            tariSiOrase.put("Italia", oraseItalia);
            tariSiOrase.put("Germania", oraseGermania);
            for (String key:tariSiOrase.keySet()){
                System.out.println("Orasele din tara " + key + " sunt: " + tariSiOrase.get(key));
            }

        }


    }

