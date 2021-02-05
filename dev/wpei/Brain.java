package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Brain{
    private List<String> statusList;

    public Brain() {
        statusList = new ArrayList();
    }

    public void reportStatus() {
        System.out.println("*****My status*****");
        if(statusList.isEmpty()) {
            System.out.println("I am ok.");
        } else {
            statusList.forEach(e -> System.out.println("I am " + e));
        }
    }

    public void setStatus(String status) {
        statusList.add(status);
    }
}
