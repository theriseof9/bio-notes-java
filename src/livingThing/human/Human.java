package livingThing.human;

import livingThing.LivingThing;
import livingThing.System;
import livingThing.human.excretorySystem.ExcretorySystem;

public class Human extends LivingThing {
    public Human() {
        systems = new System[]{
            new ExcretorySystem()
        };
        name = "Human";
    }
}
