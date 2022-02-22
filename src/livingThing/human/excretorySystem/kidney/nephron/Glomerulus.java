package livingThing.human.excretorySystem.kidney.nephron;

import filtration.Filtration;
import filtration.Ultrafiltration;
import livingThing.human.excretorySystem.kidney.KidneyComponent;

/**
 * Glomerulus, aka Bowman's Capsule: carries out
 * ultrafiltration in nephron
 */
public class Glomerulus extends KidneyComponent {
    String entrance = "afferent arteriole";
    String exit = "efferent arteriole";
    String size = "The efferent arteriole is smaller than the afferent arteriole. This is because ";
    String[] name = {"Bowman's capsule", "glomerulus"};

    Filtration ultrafiltration = new Ultrafiltration();
}

