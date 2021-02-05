package dev.wpei;

public class Stomach{
    private String status;
    private BodyListener listener;
    Stomach() {
        this.status = "no problem";
    }

    Stomach(BodyListener listener) {
        this.status = "no problem";
        this.listener = listener;
    }

    public void setListener(BodyListener listener) {
        this.listener = listener;
    }

    private void reportStatus() {
        System.out.println("Stomach has " + this.status);
    }

    void getPain() {
        status = "stomachache";
        reportStatus();
        notifyPain();
    }

    void notifyPain() {
        this.listener.sendNotification("Pain");
    }

}
