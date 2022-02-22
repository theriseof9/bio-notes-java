package livingThing.human.excretorySystem.transports;

import livingThing.Transport;
import livingThing.human.excretorySystem.bladder.Bladder;
import livingThing.human.excretorySystem.kidney.CollectingDuct;

public class RenalPelvis extends Transport {
    public RenalPelvis() {
        from = new CollectingDuct();
    }
}
