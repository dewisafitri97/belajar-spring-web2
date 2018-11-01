package com.flashdin.belajarspringweb.service;

import com.flashdin.belajarspringweb.entity.Jurusan;
import com.flashdin.belajarspringweb.entity.Mahasiswa;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface JurusanService extends BaseService<Jurusan>{
    List<Jurusan> findByName(Jurusan param);
}

