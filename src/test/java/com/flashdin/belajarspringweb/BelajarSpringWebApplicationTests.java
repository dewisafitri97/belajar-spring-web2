package com.flashdin.belajarspringweb;

import com.flashdin.belajarspringweb.constanta.Table;
import com.flashdin.belajarspringweb.entity.Fakultas;
import com.flashdin.belajarspringweb.entity.Jurusan;
import com.flashdin.belajarspringweb.entity.Mahasiswa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BelajarSpringWebApplicationTests {

	private JdbcOperations jdbcTemplate;

	@Test
	public void contextLoads() {
	}



}
