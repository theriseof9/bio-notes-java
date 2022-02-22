package livingThing.human.excretorySystem.kidney.nephron;

import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.KidneyComponent;

public class LoopOfHenle extends Transport implements KidneyComponent {
    public LoopOfHenle() {
        from = new ProximalConvolutedTubule();
        to = new DistalConvolutedTubule();
    }
}
