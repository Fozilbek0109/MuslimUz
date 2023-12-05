package uz.coder.muslimuz.model;

import java.io.Serializable;

public class DuolarModel implements Serializable {
    private String name;
    private String messege;
    private String arabName;

    public DuolarModel(String name, String messege, String arabName) {
        this.name = name;
        this.messege = messege;
        this.arabName = arabName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getArabName() {
        return arabName;
    }

    public void setArabName(String arabName) {
        this.arabName = arabName;
    }
}
