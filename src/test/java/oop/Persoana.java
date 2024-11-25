package oop;

public class Persoana {

    //OOP = programare orientata obiect (Object oriented programing)
    //4 principii importante: mosternire, incapsulare, polimorfism, abstractizare
    //mosternire este conceptul in JAVA prin care o clasa (clasa copil) mosteneste o alta clasa (clasa parinte)
    //in java se poate mosteni o singura clasa
    // in momentul in care o clasa mosteneste o alta clasa, clasa copil va trebui sa apeleze constructorul din parinte
    //in moemtnul in care se aplica mostenirea, clasa copil, are vizibilitate, asupra variabilelor si metodelor din clasa
    //parinte
    //contructorul din clasa parinte spre copil, se apeleaza cu "super"
    //in Java ca sa extinzi o alta clasa se foloseste cuvantul "extend"

    //incapsulare
    //procesul prin care tinem private anumite informatii in asa fel ca ele sa nu poata fii modificate
    //facem variabile/metode din public in private
    //private = acces control care restrictioneaza accsul doar in clasa respectiva. inseamna ca le putem
    //accesa doar in acea clasa
    //ca sa putem extrage sau modifica o valoare a unei variabile private ne folosim de metode get (returneaza valoarea deja decl)
    // si set (poate schimba valoare deja declarata)

    //conceptul prin care definim msi multe implemetnari pt o metoda. de 2 feluri
    //polimorfism static(overloading) si polimorfism dimanic(overriding)
    //polimorfism dinamic = intr o ierarhie de clase tinute prin mostenire, o metoda poate avea
    // implementari diferite
    //daca vrem sa chemam in copil metoda din parinte, treb sa folosim "super"
    //polimorfism sgtatic = posibilitatea porin care o metoda are mai multe imp,ementari prin diferentierea tipului sau
    //numarului de paramentri

    //Abstractizarea presupune expunerea doar a aspectelor esentiale ale unui obiect, ascunzand detaliile implementarii;
    // Acest lucru se realizeaza prin folosirea claselor abstracte sau a interfetelor;
    //se reduce complet imp,ementarea lasand doar numele metodelor , paramentri sau tipul returnat
    //clase abstracte= ele sunt utilizare pentru a declara caracteristicile comune ale unor subclase
    //o clasa abstracta poate fi utilizate numai ca super clasa pentru alte clase care extind clasa abstrascta,
    // poate avea rolul de parinte
    // o clasa abstracta poate avea metode abstracte (fara implmenetare) si metode concrete (cu implementare)
    // declaratia unei clase abstracte se poate face cu cuvantul cheie abstract
    // o clasa abstracta nu poate fi instantiata
    //o clasa poate mosteni mai multe interefete
    // interfata = un protocol pe care clasele trebuie sa il implementeze. Oferea rasopuns lipsei mostenire multiple
    //intr o interfata avem o colectie de metode abstracte si constante
    //interfata contine doar metode abstracte spre deosebire de clasa abstracta care cintine si merode concrete


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " +nume);
        System.out.println("Prenumele persoanei este: " +prenume);
        System.out.println("Varsta persoanei este: " +varsta);
    }
    //prima implementare a metodei , polimorfism dinamic
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
