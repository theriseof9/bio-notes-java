package livingThing.human.excretorySystem.kidney;

import livingThing.Cell;
import livingThing.Transport;
import livingThing.human.BloodContents;
import livingThing.human.excretorySystem.kidney.nephron.DistalConvolutedTubule;
import livingThing.human.excretorySystem.transports.RenalPelvis;

/**
 * Collecting duct that collects liquid from each
 * nephron's Distal convoluted tubule (DCT) and carries
 * it to the Renal Pelvis to be excreted. Can change
 * water permeability of cells making up its walls in
 * response to
 */
public class CollectingDuct extends Transport {
    Cell[] cells = new CollectingDuctCell[100]; // An arbitrary number
    BloodContents[] carries = {
        BloodContents.salts,
        BloodContents.water,
        BloodContents.urea
    };

    public CollectingDuct() {
        from = new DistalConvolutedTubule();
        to = new RenalPelvis();
    }
}

/**
 * A cell that makes up the collecting duct
 * Incomplete!!!
 */
class CollectingDuctCell extends Cell {
    CollectingDuctCell() {
        hasNucleus = true;
        description = """
            
            """;
    }
}