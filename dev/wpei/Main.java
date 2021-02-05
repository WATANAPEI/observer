package dev.wpei;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Brain brain = new Brain();
        brain.reportStatus();
        Stomach stomach = new Stomach(brain);
        stomach.getPain(brain);
        brain.reportStatus();
    }
}
