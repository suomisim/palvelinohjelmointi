package t4h14.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import t4h14.bean.*;

public class LevyDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public Levy etsi(int id) {
		String sql = "select nimi, artisti, vuosi from levyt where id = ?";
		Object[] parametrit = new Object[] { id };
		RowMapper<Levy> mapper = new LevyRowMapper();

		Levy l = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		return l;

	}

	public List<Levy> haeKaikki() {

		String sql = "select * from levyt";
		RowMapper<Levy> mapper = new LevyRowMapper();
		List<Levy> levyt = jdbcTemplate.query(sql, mapper);

		return levyt;
	}

}
