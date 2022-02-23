package livingThing.human.hormones;

import livingThing.human.misc.PituitaryGland;

public class ADH extends Hormone {
    public ADH() {
        name = "Antidiuretic Hormone (ADH)";
        description = """
            Produced by the hypothalamus and secreted by the pituitary
            gland, this hormone changes the water permeability of cells
            in the DCT and collecting duct, hence allowing osmoregulation
            to take place.
            """;
        secretedBy = new PituitaryGland();
    }
}
