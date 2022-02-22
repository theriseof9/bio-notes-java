package livingThing.human.excretorySystem;

import filtration.Filtration;
import processes.MovementProcess;

public class SelectiveReabsorption extends Filtration {
    public SelectiveReabsorption() {
        super.processes = new MovementProcess[]{
            MovementProcess.osmosis,
            MovementProcess.diffusion,
            MovementProcess.activeTransport
        };
        // Important!!!
        super.filters = new String[]{
            "proximal convoluted tubule", // Right after Bowman Capsule
            "loop of Henle",              // U-shaped thing consisting of descending and ascending limb
            "distal convoluted tubule",   // After ascending limb
            "collecting duct"             // Thicker tube that collects filtrate from all
            // nephron's distal convoluted tubule
        };
    }
}