package dev.wpei;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Brain brain = new Brain();
        brain.reportStatus();
        Stomach stomach = new Stomach();
        BodyListener painListener = new BodyListener(brain);
        stomach.setListener(painListener);
        stomach.getPain();
        brain.reportStatus();
    }
}
