package com.example.ltudddapplication.Tuan3;

public class Tuan3_Contact {
    private String ten;
    private String tuoi;
    private int hinh;

    public Tuan3_Contact(String ten, String tuoi, int hinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
