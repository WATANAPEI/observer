package dev.wpei;

public class Brain{
    private String status;

    public Brain() {
        status = "no problem";
    }

    public void reportStatus() {
        System.out.println("Brain has " + this.status);
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
