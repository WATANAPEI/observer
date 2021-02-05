package dev.wpei;

public interface BodyPart {
    String getPartName();
    void reportStatus();
    void addObserver(BodyObserver obs);
    void getStatus(String status);
}
