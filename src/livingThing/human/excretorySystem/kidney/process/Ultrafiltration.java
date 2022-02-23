package livingThing.human.excretorySystem.kidney.process;

import filtration.Contents;
import livingThing.human.BloodContents;

public class Ultrafiltration extends filtration.Ultrafiltration {
    public Ultrafiltration() {
        filters = new String[]{
            "endothelium of glomerulus",
            "basement membrane",
            "epithelium of Bowman's Capsule"
        };
        filteredContents = new Contents[]{
            BloodContents.water,
            BloodContents.urea,
            BloodContents.aminoAcids,
            BloodContents.salts,
            BloodContents.glucose
        };
    }
}
