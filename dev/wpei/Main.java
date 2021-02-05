package dev.wpei;

public class Main {

    public static void main(String[] args) {
        //construct body parts
        Brain brain = new Brain();
        Stomach stomach = new Stomach();
        Leg leg = new Leg();
        BodyListener bodyListener = new BodyListener(brain);


        // report initial status
        brain.reportStatus();
        stomach.reportStatus();
        leg.reportStatus();

        stomach.setListener(bodyListener);
        leg.setListener(bodyListener);

        //change body status
        stomach.getPain();
        stomach.getHungry();
        stomach.reportStatus();
        leg.getMusclePain();
        brain.reportStatus();
    }
}
