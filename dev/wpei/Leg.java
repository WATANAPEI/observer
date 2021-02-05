package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Leg {
    List<String> statusList;
    BodyListener listener;

    public Leg() {
        statusList = new ArrayList<>();
    }

    public void setListener(BodyListener listener) {
        this.listener = listener;
    }

    public void getMusclePain() {
        statusList.add("muscle pain");
        System.out.println("Leg got muscle pain");
        notifyMusclePain();
    }

    public void reportStatus() {
        System.out.println("*****Leg status*****");
        if(statusList.isEmpty()) {
            System.out.println("Leg is ok.");
        } else {
            statusList.forEach(e -> System.out.println("Leg has " + e));
        }
    }

    private void notifyMusclePain() {
        this.listener.sendNotification("muscle pain");
    }



}
