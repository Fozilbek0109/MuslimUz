package uz.coder.muslimuz.model;

public class AlAsmaAlHusnaModel {
    private int count;
    private  String name;
    private String messege;


    public AlAsmaAlHusnaModel(int count, String name, String messege) {
        this.count = count;
        this.name = name;
        this.messege = messege;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
