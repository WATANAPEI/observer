package dev.wpei;

public class Main {

    public static void main(String[] args) {
        //construct body parts
        Brain brain = new Brain();
        BodyPart stomach = new Stomach();
        BodyPart leg = new Leg();

        //brain observe body parts
        stomach.addObserver(brain);
        leg.addObserver(brain);


        // report initial status
        brain.reportStatus();
        stomach.reportStatus();
        leg.reportStatus();

        //change body status
        stomach.getStatus("stomachache");
        stomach.getStatus("hungry");
        stomach.reportStatus();
        leg.getStatus("muscle pain");
        leg.reportStatus();

        brain.reportStatus();
    }
}
