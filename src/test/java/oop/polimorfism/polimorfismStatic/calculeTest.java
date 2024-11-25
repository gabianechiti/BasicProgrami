package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class calculeTest {
    @Test
    public void testAdunare(){
        Calcule calcule =  new Calcule();
        System.out.println("Adunare a doua int uri este: " + calcule.adunare(2,3));
        System.out.println("Adunare a doua doubleuri este: " + calcule.adunare(2.1, 1.2));
        System.out.println("Adunare a doua Stringuri este: " + calcule.adunare("Buna", "Seara"));
    }
}
