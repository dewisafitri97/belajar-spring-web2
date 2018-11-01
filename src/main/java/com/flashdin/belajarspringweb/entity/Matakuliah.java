package com.flashdin.belajarspringweb.entity;

import java.io.Serializable;


public class Matakuliah extends User implements Serializable {

    private String makul;

//    List<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();

    public Matakuliah() {
    }

    public Matakuliah(String makul) {
        this.makul = makul;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

//    public List<Mahasiswa> getDaftarMahasiswa() {
//        return daftarMahasiswa;
//    }
//
//    public void setDaftarMahasiswa(List<Mahasiswa> daftarMahasiswa) {
//        this.daftarMahasiswa = daftarMahasiswa;
//    }

    @Override
    public String toString() {
        return "Matakuliah{" +
                "id=" + id +
                ", makul='" + makul + '\'' +
                '}';
    }
}
