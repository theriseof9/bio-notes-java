package livingThing.human.excretorySystem.kidney.nephron;

import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.CollectingDuct;
import livingThing.human.excretorySystem.kidney.KidneyComponent;

public class DistalConvolutedTubule extends Transport implements KidneyComponent {
    public DistalConvolutedTubule() {
        from = new LoopOfHenle();
        to = new CollectingDuct();
    }
}
