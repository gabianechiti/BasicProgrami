package oop.polimorfism.dimanic;
import com.beust.ah.A;
import org.testng.annotations.Test;

public class animalTest {
    @Test

    public void suneteAnimale(){
        Caine Azorel = new Caine();
        Azorel.scoateSunet();
        Pisica Mita = new Pisica();
        Mita.scoateSunet();

        Animal animal = new Animal();
        animal.scoateSunet();

    }


}
