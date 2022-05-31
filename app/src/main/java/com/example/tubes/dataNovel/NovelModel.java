package com.example.tubes.dataNovel;

public class NovelModel {
    String nama, keterangan,penulis;
    Integer profile;

    public NovelModel(String nama, String keterangan, String penulis,Integer profile) {
        this.nama = nama;
        this.penulis =penulis;
        this.keterangan = keterangan;
        this.profile = profile;
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
