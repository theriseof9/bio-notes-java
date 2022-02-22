package livingThing.human.excretorySystem;

import livingThing.NitrogenousWastes;
import livingThing.human.Organ;
import livingThing.human.System;
import livingThing.human.excretorySystem.kidney.Kidney;

public class ExcretorySystem extends System {
    NitrogenousWastes removes = NitrogenousWastes.Urea;
    String[]
            liver = {"bile pigments"},
            skin = {"sweat", "urea", "excess water", "excess salts"},
            lungs = {"air", "carbon dioxide", "water vapour"},
            kidneys = {"urine", "urea", "excess water", "excess salts"};

    public ExcretorySystem() {
        super.organs = new Organ[]{
            new Kidney()
        };
    }
}