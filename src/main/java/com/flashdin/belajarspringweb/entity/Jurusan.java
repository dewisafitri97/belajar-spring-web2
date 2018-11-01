package com.flashdin.belajarspringweb.entity;

import java.io.Serializable;

public class Jurusan implements Serializable {

    private int id;
    private String nama;
    private int idFakultas;

    private Fakultas fakultas;

    public Jurusan(){

    }

    public Jurusan(int id, String nama, int idFakultas){
        this.id = id;
        this.nama = nama;
        this.idFakultas = idFakultas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public String toString() {
        return "Jurusan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                "idFakultas=" + idFakultas +
                '}';
    }

}
