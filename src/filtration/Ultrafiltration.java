package filtration;

import processes.MovementProcess;

public class Ultrafiltration extends Filtration {
    public Ultrafiltration() {
        processes = new MovementProcess[]{
            MovementProcess.diffusion
        };
        required = new String[]{"force", "filter"};
        traits = new String[]{
            "Fast",
            "Filters by size"
        };
    }
}