package livingThing.human.excretorySystem.kidney.nephron;

import livingThing.Transport;

/**
 * Carries out ultrafiltration of blood in glomerulus
 * Structure wraps around glomerulus and filtrate
 * (glomerular filtrate) exits into the Proximal
 * convoluted Tubule (PCT)
 */
public class BowmanCapsule extends Transport {
    public BowmanCapsule() {
        to = new ProximalConvolutedTubule();
    }
}
