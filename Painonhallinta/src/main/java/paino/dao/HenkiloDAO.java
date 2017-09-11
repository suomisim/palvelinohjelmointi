package paino.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import paino.bean.*;
import paino.servlet.*;

public class HenkiloDAO {
	

	public HenkiloDAO() throws DAOPoikkeus {
		try {
			Class.forName(DBConnectionProperties.getInstance().getProperty("driver")).newInstance();
		} catch(Exception e) {
			throw new DAOPoikkeus("Ajurivirhe", e);
		}
	}
	
	private Connection avaaYhteys() throws DAOPoikkeus {
		
		try {
			return DriverManager.getConnection(
					DBConnectionProperties.getInstance().getProperty("url"), 
					DBConnectionProperties.getInstance().getProperty("username"),
					DBConnectionProperties.getInstance().getProperty("password"));
		} catch (Exception e) {
			throw new DAOPoikkeus("Tietokantayhteysvirhe", e);
		}
	}

	private void suljeYhteys(Connection yhteys) throws DAOPoikkeus {
		try {
			if (yhteys != null && !yhteys.isClosed())
				yhteys.close();
		} catch(Exception e) {
			throw new DAOPoikkeus("Tietokantayhteyden sulkeutumisvirhe", e);
		}
	}
	

	public List<PainoHenkilo> hae(Henkilo h) throws DAOPoikkeus{		
		
		ArrayList<PainoHenkilo> painohenkilot = new ArrayList<PainoHenkilo>();
		Connection yhteys = avaaYhteys();
		
		try {
				
			String sql = "select date, weigth from webuser_weigth where userid=1";
			
			//PreparedStatement lause = yhteys.prepareStatement(sql);
			//lause.setInt(1, h.getId());
			//lause.executeUpdate();


			Statement haku = yhteys.createStatement();
			ResultSet tulokset = haku.executeQuery(sql);
			
			while(tulokset.next()) {
				String paiva = tulokset.getString("date");
				double paino = tulokset.getDouble("weigth");
				PainoHenkilo ph = new PainoHenkilo(paiva, paino);
				painohenkilot.add(ph);
			}
			
		} catch(Exception e) {
			throw new DAOPoikkeus("Tietokantahakuvirhe", e);
		}finally {
			
			suljeYhteys(yhteys);
		}
		return painohenkilot;
		
	}

	public void lisaa(Henkilo h) throws DAOPoikkeus{
			
		Connection yhteys = avaaYhteys();
		
		try {
			
			String sql = "INSERT INTO webuser_weigth (date, userid, weigth) values(?,?,?)";
			PreparedStatement lause = yhteys.prepareStatement(sql);
			
			lause.setString(1, h.getDate());
			lause.setInt(2, h.getId());
			lause.setDouble(3, h.getPaino());
			lause.executeUpdate();
			
			System.out.println("Lisättiin painotiedot tietokantaan.");
		} catch(Exception e) {

			throw new DAOPoikkeus("Tietojen lisäyksessä virhe", e);
		}finally {

			suljeYhteys(yhteys);
		}

	}

}
