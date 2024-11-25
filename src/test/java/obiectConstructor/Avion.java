package obiectConstructor;

public class Avion {
    //constructorul are rolul sa initieze variabilele unei clase
    //recunoastem constructorul dupa numele clasei - este o metoda speciala care nu are void sau return
    //intr o clasa putem avea unul sau mai multi
    // constructori care se diferentiaza dupa nr sau tipul de paramentrii
    //intr o clasa exista tot timpul un constructor default (fara paramentrii)
    //constructorii sunt cu paramentrii sau fara paramentrii
    //constructorul trebuie sa fie intotdeauna public

    //un obiect in java este o instanta a unei clase
    //ca sa initializam un obiect folosim cuvantul "new"
    //in momentul cand se initializeaza un opbiect practic se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public int capacitatePasageri;
    public int anFabricatie;
    public Integer capacitateBagaje;
    public String modelAvion;

    public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, Integer capacitateBagaje, String modelAvion){
    this.tip = tip;
    this.marca = marca;
    this.capacitatePasageri = capacitatePasageri;
    this.capacitateBagaje = capacitateBagaje;
    this.anFabricatie = anFabricatie;
    this.modelAvion = modelAvion;
    }

    public void prezentareAvion(){
        System.out.println(" Tipul avionului este: " +tip);
        System.out.println(" Marca avionul este: "+marca);
        System.out.println(" Capacitatea maxima de pasageri este: "+capacitatePasageri);
        if (capacitateBagaje != null){
            System.out.println(" Capacitatea maxima de bagaje este: "+capacitateBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }

    }
    public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.modelAvion = modelAvion;
    }
}
