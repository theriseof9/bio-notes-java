package livingThing.human.excretorySystem.kidney.nephron;

import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.KidneyComponent;

public class ProximalConvolutedTubule extends Transport implements KidneyComponent {
    public ProximalConvolutedTubule() {
        from = new BowmanCapsule();
        to = new LoopOfHenle();
        name = "Proximal Convoluted Tubule (PCT)";
    }
}
