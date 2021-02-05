package dev.wpei;

public class Stomach{
    private String status;
    private Brain brain;

    Stomach(Brain brain) {
        this.status = "no problem";
        this.brain = brain;
    }

    private void reportStatus() {
        System.out.println("Stomach has " + this.status);
    }

    void getPain(Brain brain) {
        status = "stomachache";
        reportStatus();
        notifyPain(brain);
    }

    void notifyPain(Brain brain) {
        brain.setStatus("Stomachache");
    }

}
