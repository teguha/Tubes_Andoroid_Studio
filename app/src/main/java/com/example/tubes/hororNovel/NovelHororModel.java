package com.example.tubes.hororNovel;

public class NovelHororModel {
    String nama, keterangan,penulis;
    Integer profile;

    public NovelHororModel(String nama, String keterangan, String penulis,Integer profile) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.profile = profile;
        this.penulis =penulis;

    }


    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
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
}
