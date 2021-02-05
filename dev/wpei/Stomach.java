package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Stomach implements BodyPart{
    private List<String> statusList;
    private List<BodyObserver> bodyObservers;
    Stomach() {
        statusList = new ArrayList();
        bodyObservers = new ArrayList();
    }

    @Override
    public void addObserver(BodyObserver ob) {
        this.bodyObservers.add(ob);
    }

    @Override
    public void reportStatus() {
        System.out.println("*****Stomach status*****");
        if(statusList.isEmpty()) {
            System.out.println("Stomach is ok");
        } else {
            statusList.forEach(e -> System.out.println("Stomach has " + e));
        }
    }

    @Override
    public void getStatus(String status) {
        statusList.add(status);
        System.out.println("Stomach got " + status);
        setNotification(status);
    }

    protected void setNotification(String status) {
        for(BodyObserver obs: bodyObservers) {
            obs.onBodyStatusNotify(this, status);
        }
    }

//    void notifyPain() {
//        this.listener.sendNotification("stomachache");
//    }
//
//    void notifyHungry() {
//        this.listener.sendNotification("hungry");
//    }

    @Override
    public String getPartName() {
        return "Stomach";
    }
}
