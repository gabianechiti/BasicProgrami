package obiectConstructor;

import org.testng.annotations.Test;

public class testAngajat {

    @Test
    public void informatiiAngajat(){
        Angajat angajat1 = new Angajat("Edi", 8500);
        System.out.println("Numele angajatului este: " +angajat1.getNume()+ "avand salariul de: " + angajat1.getSalariu());
        Angajat angajat2 = new Angajat("", -5);
        System.out.println("Numele angajatului este: " +angajat2.getNume()+ "avand salariul de: " + angajat2.getSalariu());
    }
}
