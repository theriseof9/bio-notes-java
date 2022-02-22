package livingThing.human.excretorySystem.kidney.nephron;

import livingThing.human.excretorySystem.SelectiveReabsorption;
import livingThing.human.excretorySystem.kidney.KidneyComponent;

public class Nephron extends KidneyComponent {
    SelectiveReabsorption selectiveReabsorption = new SelectiveReabsorption();

    KidneyComponent glomerulus = new Glomerulus();
    KidneyComponent dct = new DistalConvolutedTubule();
    KidneyComponent loopOfHenle = new LoopOfHenle();
    KidneyComponent pct = new ProximalConvolutedTubule();
}

