package t4h14.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import t4h14.bean.*;

public class LevyRowMapper implements RowMapper<Levy> {

	public Levy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Levy l = new Levy();
		l.setNimi(rs.getString("nimi"));
		l.setArtisti(rs.getString("artisti"));
		l.setId(rs.getInt("id"));
		l.setVuosi(rs.getInt("vuosi"));
		
		return l;
	}

}
