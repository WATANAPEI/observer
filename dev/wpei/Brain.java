package dev.wpei;

import java.util.HashMap;
import java.util.Map;

public class Brain implements BodyObserver{
    private Map<BodyPart, String> statusList;

    public Brain() {
        statusList = new HashMap();
    }

    public void reportStatus() {
        System.out.println("*****My status*****");
        if(statusList.isEmpty()) {
            System.out.println("I am ok.");
        } else {
            for(Map.Entry<BodyPart, String> e: statusList.entrySet()) {
                System.out.println("My " + e.getKey().getPartName() + " has " + e.getValue());
            }
        }
    }

    public void setStatus(BodyPart part, String status) {
        statusList.putIfAbsent(part, status);
    }

    @Override
    public void onBodyStatusNotify(BodyPart part, String status) {
        setStatus(part, status);
        System.out.println("My " + part.getPartName() + " got " + status);
    }
}
