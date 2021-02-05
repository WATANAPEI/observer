package dev.wpei;

public class Main {

    public static void main(String[] args) {
        Brain brain = new Brain();
        brain.reportStatus();
        Stomach stomach = new Stomach();
        BodyListener bodyListener = new BodyListener(brain);
        stomach.setListener(bodyListener);
        stomach.getPain();
        stomach.getHungry();
        stomach.reportStatus();
        brain.reportStatus();
    }
}
