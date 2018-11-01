package com.flashdin.belajarspringweb.entity;

import java.io.Serializable;

public class Mahasiswa extends User implements Serializable {

    private String namaMhs;
    private String alamat;
    //private int idMakul;
    private int idJurusan;
    private int idFakultas;



    private Jurusan jurusan;
    private Fakultas fakultas;
    private Matakuliah matakuliah;

    public Mahasiswa() {
    }

    public Mahasiswa(String namaMhs, String alamat) {
        this.namaMhs = namaMhs;
        this.alamat = alamat;
    }

    public Mahasiswa( int idJurusan, int idFakultas){
        //this.idMakul = idMakul;
        this.idJurusan = idJurusan;
        this.idFakultas = idFakultas;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

//    public int getIdMakul() {
//        return idMakul;
//    }
//
//    public void setIdMakul(int idMakul) {
//        this.idMakul = idMakul;
//    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", namaMhs='" + namaMhs + '\'' +
                ", alamat='" + alamat + '\'' +
                "idJurusan=" + idJurusan +
                "idFakultasl=" + idFakultas +
                '}';
    }


}
