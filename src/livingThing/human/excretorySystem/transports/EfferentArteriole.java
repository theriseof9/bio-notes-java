package livingThing.human.excretorySystem.transports;

import livingThing.Transport;
import livingThing.human.excretorySystem.kidney.nephron.Glomerulus;

/**
 * A blood vessel that brings blood from the renal artery
 * to the Glomerulus for filtration
 */
public class EfferentArteriole extends Transport {
    public EfferentArteriole() {
        from = new Glomerulus();
    }
}
