package uz.coder.muslimuz.model;

import java.io.Serializable;

public class DateModel implements Serializable {
    private String qachon;
    private String kunVaqti;
    private  String  soat;


    public DateModel(String qachon, String kunVaqti, String soat) {
        this.qachon = qachon;
        this.kunVaqti = kunVaqti;
        this.soat = soat;

    }

    public String getQachon() {
        return qachon;
    }

    public void setQachon(String qachon) {
        this.qachon = qachon;
    }

    public String getKunVaqti() {
        return kunVaqti;
    }

    public void setKunVaqti(String kunVaqti) {
        this.kunVaqti = kunVaqti;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }


}
