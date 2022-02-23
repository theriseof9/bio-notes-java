package livingThing.human.excretorySystem.kidney.nephron;

import filtration.Filtration;
import filtration.Ultrafiltration;
import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.KidneyComponent;
import livingThing.human.excretorySystem.transports.AfferentArteriole;
import livingThing.human.excretorySystem.transports.EfferentArteriole;

/**
 * Glomerulus: carries out ultrafiltration in nephron,
 * filtrate exits to proximal convoluted tubule through
 * Bowman's Capsule
 */
public class Glomerulus extends Transport implements KidneyComponent {
    String size = "The efferent arteriole is smaller than the afferent arteriole. This is because ";
    String[] name = {"Bowman's capsule", "glomerulus"};

    Filtration ultrafiltration = new Ultrafiltration();

    public Glomerulus() {
        to = new EfferentArteriole();
        from = new AfferentArteriole();
    }
}
