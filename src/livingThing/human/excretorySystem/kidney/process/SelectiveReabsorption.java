package livingThing.human.excretorySystem.kidney.process;

import filtration.Filtration;
import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.CollectingDuct;
import livingThing.human.excretorySystem.kidney.nephron.DistalConvolutedTubule;
import livingThing.human.excretorySystem.kidney.nephron.LoopOfHenle;
import livingThing.human.excretorySystem.kidney.nephron.ProximalConvolutedTubule;
import processes.MovementProcess;

public class SelectiveReabsorption extends Filtration {
    public SelectiveReabsorption() {
        super.processes = new MovementProcess[]{
            MovementProcess.osmosis,
            MovementProcess.diffusion,
            MovementProcess.activeTransport
        };
        // Important!!!
        super.filters = new Transport[]{
            new DistalConvolutedTubule(),
            new CollectingDuct() // Thicker tube that collects filtrate from all nephrons
        };
    }
}