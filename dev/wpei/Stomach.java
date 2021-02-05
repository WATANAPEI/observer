package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Stomach{
    private List<String> statusList;
    private BodyListener listener;
    Stomach() {
        statusList = new ArrayList<>();
    }

    Stomach(BodyListener listener) {
        this.listener = listener;
    }

    public void setListener(BodyListener listener) {
        this.listener = listener;
    }

    void reportStatus() {
        System.out.println("*****Stomach status*****");
        if(statusList.isEmpty()) {
            System.out.println("Stomach is ok");
        } else {
            this.statusList.forEach(e -> System.out.println("Stomach has " + e));
        }
    }

    void getPain() {
        statusList.add("stomachache");
        System.out.println("Stomach got pain");
        notifyPain();
    }

    void getHungry() {
        statusList.add("Hungry");
        System.out.println("Stomach got hungry");
        notifyHungry();
    }

    void notifyPain() {
        this.listener.sendNotification("stomachache");
    }

    void notifyHungry() {
        this.listener.sendNotification("hungry");
    }

}
