package livingThing.human.excretorySystem;

import livingThing.NitrogenousWastes;
import livingThing.human.System;
import livingThing.human.excretorySystem.kidney.Kidney;

public class ExcretorySystem extends System {
    NitrogenousWastes removes = NitrogenousWastes.Urea;
    String[]
            liver = {"bile pigments"},
            skin = {"sweat", "urea", "excess water", "excess salts"},
            lungs = {"air", "carbon dioxide", "water vapour"},
            kidneys = {"urine", "urea", "excess water", "excess salts"};
    Kidney kidney = new Kidney();
}