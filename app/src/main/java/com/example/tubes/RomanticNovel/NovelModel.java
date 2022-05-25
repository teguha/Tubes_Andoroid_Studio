package com.example.tubes.RomanticNovel;

import java.util.ArrayList;

public class NovelModel {
    String nama_novel , keterangan;
    int gambar_novel;

    public NovelModel(String nama_novel , String keterangan , Integer gambar_novel){
        this.nama_novel = nama_novel;
        this.keterangan=keterangan;
        this.gambar_novel = gambar_novel;

    }

    public int getGambar_novel() {
        return gambar_novel;
    }
    public void setGambar_novel(int gambar_novel){
        this.gambar_novel=gambar_novel;
    }

    public String getNama_novel(){
        return nama_novel;
    }

    public void setNama_novel(String nama_novel){
        this.nama_novel=nama_novel;
    }

    public String getKeterangan(){
        return  keterangan;
    }
    public void setKeterangan(String keterangan){
        this.keterangan=keterangan;
    }
}
