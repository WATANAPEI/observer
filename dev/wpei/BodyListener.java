package dev.wpei;

public class BodyListener {
    Brain brain;

    BodyListener(Brain brain) {
        this.brain = brain;
    }

    void sendNotification(String status) {
        brain.setStatus(status);
    }
}
