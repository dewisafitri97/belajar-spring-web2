package com.flashdin.belajarspringweb.entity;

import java.io.Serializable;

public class Fakultas extends User implements Serializable {


    private  String nama;


    public Fakultas(){ this.id=id;
    }


    public Fakultas (String nama){

        this.nama = nama;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }




    @Override
    public String toString() {
        return "Fakultas{" +
                "id=" + id +
                ", nama_='" + nama + '\'' +
                '}';
    }
}
