package livingThing.human.excretorySystem.kidney;

import livingThing.Function;
import livingThing.human.Organ;
import livingThing.human.excretorySystem.kidney.nephron.Nephron;

public class Kidney extends Organ {
    Nephron[] nephrons = new Nephron[1000000]; // Do not actually init them
    String[] portions = {"renal mendulla", "renal pelvis"};

    public Kidney() {
        name = "Kidney";
        super.description = """
     Filters nitrogenous wastes in the form of urea from the bloodstream
     and carries out osmoregulation, producing urine which is transported,
     via the renal pelvis, into the bladder while awaiting excretion.
     """;
        super.functions = new Function[]{
            new Function(
                "Remove urea from bloodstream",
                """
                    Filters nitrogenous waste in the form of urea from the
                    blood into 
                    """
            ),
            new Function(
                "Regulate osmolality of blood",
                ""
            )
        };
    }
}