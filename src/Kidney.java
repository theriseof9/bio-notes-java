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
    String[] filteredContents = {"water", "urea", "amino acids", "salts", "glucose"};
    String[] required = {"force", "filter"};
}
class SelectiveReabsorption {

}