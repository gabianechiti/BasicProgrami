package oop.abstractizare.interfete;
import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitatiRestaurant(){
        Bucatar Marius = new Bucatar();
        Marius.pregatesteMancarea("Sarmale");

        Chelner Ionut = new Chelner();
        Ionut.servesteMancare(3, "Sarmale");
        Ionut.curataMasa(3);
    }
}
