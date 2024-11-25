package oop.abstractizare.claseAbstracte;
import org.testng.annotations.Test;

public class FormeGeometriceTest {

    @Test
    public void testFormeGeometrice(){
        Patrat patrat = new Patrat();
        patrat.informatiiFormeGeometrice();
        patrat.deseneaza();

        Triunghi triunghi = new Triunghi();
        triunghi.informatiiFormeGeometrice();
        triunghi.deseneaza();

        //clasa abstracta nu se poate instantia
        //formeGeometrice fg = new formeGeometrice() {

            }
        }




