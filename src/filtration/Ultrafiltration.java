package filtration;

import livingThing.human.BloodContents;
import processes.MovementProcess;

public class Ultrafiltration extends Filtration {
    BloodContents[] filteredContents = {
        BloodContents.water,
        BloodContents.urea,
        BloodContents.aminoAcids,
        BloodContents.salts,
        BloodContents.glucose
    };
    String[] required = {"force", "filter"};

    public Ultrafiltration() {
        super.processes = new MovementProcess[]{
            MovementProcess.diffusion
        };
        super.filters = new String[]{"basement membrane"};
    }
}