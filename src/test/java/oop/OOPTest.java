package oop;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void testMethod() {

        Student Laura = new Student("Popescu", "Laura", 20, "Psihologie", true, "Filosofie");
//        Laura.infoStudent();
        Laura.mananca();
        Laura.mergeLaCursuri();


        Angajat Eduard = new Angajat("Ionescu", "Eduard", 22, "Arka", "inginer", 1);
//        Eduard.infoAngajat();
        Eduard.mananca();
        Eduard.programLucru();
        Eduard.programLucru(4);
        Eduard.programLucru("remote");
        Eduard.programLucru(false);
        Eduard.primesteSalariu();

        StudentAngajat Marius = new StudentAngajat("Popescu", "Marius", 20, "Viata", "Contab", "20");
        Marius.mergeLaPetreceri();
        Marius.primesteSalariu();
    }


}
