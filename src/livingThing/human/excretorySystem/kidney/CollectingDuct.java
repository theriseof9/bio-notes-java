package livingThing.human.excretorySystem.kidney;

import livingThing.human.BloodContents;

/**
 * Collecting duct that collects liquid from each
 * nephron's Distal convoluted tubule (DCT) and carries
 * it to the Renal Pelvis to be excreted. Can change
 * water permeability of cells making up its walls in
 * response to
 */
public class CollectingDuct {
    BloodContents[] carries = {
        BloodContents.salts,
        BloodContents.water,
        BloodContents.urea
    };
    String from = "distal convoluted tubule";
    String to = "renal pelvis";
}
