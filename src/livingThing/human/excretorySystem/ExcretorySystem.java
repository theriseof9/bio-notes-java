package livingThing.human.excretorySystem;

import livingThing.NitrogenousWastes;
import livingThing.human.Organ;
import livingThing.System;
import livingThing.human.excretorySystem.kidney.Kidney;

public class ExcretorySystem extends System {
    NitrogenousWastes removes = NitrogenousWastes.Urea;
    String[]
            liver = {"bile pigments"},
            skin = {"sweat", "urea", "excess water", "excess salts"},
            lungs = {"air", "carbon dioxide", "water vapour"},
            kidneys = {"urine", "urea", "excess water", "excess salts"};

    public ExcretorySystem() {
        name = "Excretory System";
        description = """
            Excretes/secretes/egests nitrogenous waste in various forms
            out of the body via various organs.
            """;
        organs = new Organ[]{
            new Kidney()
        };
    }
}