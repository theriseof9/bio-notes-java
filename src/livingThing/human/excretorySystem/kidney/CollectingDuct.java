package livingThing.human.excretorySystem.kidney;

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
