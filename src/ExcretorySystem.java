public class ExcretorySystem {
    NitrogenousWastes removed = NitrogenousWastes.Urea;
    String[] liver = {"bile pigments"}, skin = {"sweat", "urea", "excess water", "excess salts"}, lungs = {"air", "carbon dioxide", "water vapour"}, kidneys = {"urine", "urea", "excess water", "excess salts"};
    Kidney kidney = new Kidney();
}

enum NitrogenousWastes {
    Ammonia,
    Urea,
    UricAcid
}