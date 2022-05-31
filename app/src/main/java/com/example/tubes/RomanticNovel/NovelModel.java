package com.example.tubes.RomanticNovel;

import java.util.ArrayList;

public class NovelModel {
    String nama , keterangan,penulis;
    int profile;

    public NovelModel(String nama_novel , String penulis, String keterangan , Integer gambar_novel){
        this.nama = nama_novel;
        this.keterangan=keterangan;
        this.penulis=penulis;
        this.profile = gambar_novel;
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
