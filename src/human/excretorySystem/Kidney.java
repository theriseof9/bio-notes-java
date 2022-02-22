package human.excretorySystem;

import human.BloodContents;

public class Kidney {
    String definition = "";
    Ultrafiltration ultrafiltration = new Ultrafiltration();
    SelectiveReabsorption selectiveReabsorption = new SelectiveReabsorption();
}

class Ultrafiltration {
    String filter = "";
    String entrance = "afferent arteriole";
    String exit = "efferent arteriole";
    String size = "The efferent arteriole is smaller than the afferent arteriole. This is because ";
    String[] location = {"Bowman's capsule", "glomerulus"};

    BloodContents[] filteredContents = {
            BloodContents.water,
            BloodContents.urea,
            BloodContents.aminoAcids,
            BloodContents.salts,
            BloodContents.glucose
    };
    String[] required = {"force", "filter"};
}
class SelectiveReabsorption {

}