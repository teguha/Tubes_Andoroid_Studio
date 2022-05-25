package com.example.tubes.Inspiratif;

public class InspiratifModels {
    String nama, keterangan,pengarang;
    Integer profile;

    public InspiratifModels(String nama, String keterangan, Integer profile) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.profile = profile;
        this.pengarang= pengarang;
    }



    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return keterangan;
    }

    public void setDetail(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getImage() {
        return profile;
    }

    public void setImage(int profile) {
        this.profile = profile;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
