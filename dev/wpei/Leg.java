package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Leg implements BodyPart{
    List<String> statusList;
    private List<BodyObserver> bodyObservers;

    public Leg() {
        statusList = new ArrayList<>();
        bodyObservers = new ArrayList();
    }

    @Override
    public void addObserver(BodyObserver ob) {
        this.bodyObservers.add(ob);
    }

    @Override
    public void getStatus(String status) {
        statusList.add(status);
        System.out.println("Leg got " + status);
        setNotification(status);
    }

    @Override
    public void reportStatus() {
        System.out.println("*****Leg status*****");
        if(statusList.isEmpty()) {
            System.out.println("Leg is ok.");
        } else {
            statusList.forEach(e -> System.out.println("Leg has " + e));
        }
    }

    protected void setNotification(String status) {
        for(BodyObserver obs: bodyObservers) {
            obs.onBodyStatusNotify(this, status);
        }
    }


    @Override
    public String getPartName() {
        return "Leg";
    }
}
