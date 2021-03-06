package com.flashdin.belajarspringweb.dao;

import com.flashdin.belajarspringweb.entity.Fakultas;
import com.flashdin.belajarspringweb.entity.Mahasiswa;

import java.util.List;

public interface FakultasDAO extends BaseDAO<Fakultas>{

    List<Fakultas> findByName(Fakultas param);
}
