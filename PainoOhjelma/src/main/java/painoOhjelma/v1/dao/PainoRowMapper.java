package painoOhjelma.v1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import painoOhjelma.v1.bean.*;

public class PainoRowMapper implements RowMapper<Paino> {

	public Paino mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paino p = new PainoImpl();
		p.setPvm(rs.getString("pvm"));
		p.setPaino(rs.getString("paino"));
		return p;
	}

}

