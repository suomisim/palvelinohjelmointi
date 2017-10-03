package painoOhjelma.v1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import painoOhjelma.v1.bean.*;

@Repository
public class PainoDAOSpringJdbcImpl implements PainoDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void talleta(Paino p) {
		
		final String sql = "INSERT INTO painot(pvm, paino) VALUES(?,?)";

		final String pvm = p.getPvm();
		final String paino = p.getPaino();

		KeyHolder idHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,
						new String[] { "id" });
				ps.setString(1, pvm);
				ps.setString(2, paino);
				return ps;
			}
		}, idHolder);

		p.setId(idHolder.getKey().intValue());

	}
	public List<Paino> haeTietty(String pvm) {
		String sql = "SELECT pvm, paino FROM painot WHERE pvm = ?";
		Object[] parametrit = new Object[] { pvm };
		RowMapper<Paino> mapper = new PainoRowMapper();

		List<Paino> painot;
		try {
			painot = jdbcTemplate.query(sql, parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
			throw new PainoPuuttuu(e);
		}
		return painot;

	}

	public List<Paino> haeKaikki() {

		String sql = "SELECT pvm, paino FROM painot";
		RowMapper<Paino> mapper = new PainoRowMapper();
		List<Paino> painot = jdbcTemplate.query(sql, mapper);

		return painot;
	}
	

}
