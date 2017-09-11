package t1h20.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import t1h20.bean.Henkilo;

public class HenkiloDAO {
	

	public HenkiloDAO() throws DAOPoikkeus {
		try {
			Class.forName(DBConnectionProperties.getInstance().getProperty("driver")).newInstance();
		} catch(Exception e) {
			throw new DAOPoikkeus("Tietokannan ajuria ei kyetty lataamaan.", e);
		}
	}
	

	private Connection avaaYhteys() throws DAOPoikkeus {
		
		try {
			return DriverManager.getConnection(
					DBConnectionProperties.getInstance().getProperty("url"), 
					DBConnectionProperties.getInstance().getProperty("username"),
					DBConnectionProperties.getInstance().getProperty("password"));
		} catch (Exception e) {
			throw new DAOPoikkeus("Tietokantayhteyden avaaminen epÃ¤onnistui", e);
		}
	}
	

	private void suljeYhteys(Connection yhteys) throws DAOPoikkeus {
		try {
			if (yhteys != null && !yhteys.isClosed())
				yhteys.close();
		} catch(Exception e) {
			throw new DAOPoikkeus("Tietokantayhteys ei jostain syystÃ¤ suostu menemÃ¤Ã¤n kiinni.", e);
		}
	}
	

	public List<Henkilo> haeKaikki() throws DAOPoikkeus{		
		
		ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
		
		Connection yhteys = avaaYhteys();
		
		try {
			
			String sql = "select id, etunimi, sukunimi from henkilo";
			Statement haku = yhteys.createStatement();
			ResultSet tulokset = haku.executeQuery(sql);
			
			while(tulokset.next()) {
				int id = tulokset.getInt("id");
				String etunimi = tulokset.getString("etunimi");
				String sukunimi = tulokset.getString("sukunimi");
				
				Henkilo h = new Henkilo(id, etunimi, sukunimi);
				henkilot.add(h);
			}
			
		} catch(Exception e) {

			throw new DAOPoikkeus("Tietokantahaku aiheutti virheen", e);
		}finally {
			//LOPULTA AINA SULJETAAN YHTEYS
			suljeYhteys(yhteys);
		}
		
		System.out.println("Haettiin tietonannasta henkilöt: " +henkilot.toString());
		
		return henkilot;
	}

	public void lisaa(Henkilo h) throws DAOPoikkeus{
			
		Connection yhteys = avaaYhteys();
		
		try {
			
			String sql = "insert into henkilo(etunimi, sukunimi) values(?,?)";
			PreparedStatement lause = yhteys.prepareStatement(sql);
			
			lause.setString(1, h.getEtunimi());
			lause.setString(2, h.getSukunimi());
			
			lause.executeUpdate();
			System.out.println("Lisättiin henkilö tietokantaan: "+h);
		} catch(Exception e) {

			throw new DAOPoikkeus("Henkilön lisäämisyritys aiheutti virheen", e);
		}finally {
			suljeYhteys(yhteys);
		}

	}
	public void poista(Henkilo h) throws DAOPoikkeus{
		
		Connection yhteys = avaaYhteys();
		
		try {
			
			String sql = "delete from henkilo where id=(?)";
			PreparedStatement lause = yhteys.prepareStatement(sql);
			
			lause.setInt(1, h.getId());
			
			lause.executeUpdate();
			System.out.println("POISTETTIIN HENKILÖ TIETOKANNASTA");
		} catch(Exception e) {
			throw new DAOPoikkeus("Henkilön poistoyritys aiheutti virheen", e);
		}finally {
			suljeYhteys(yhteys);
		}

	}

}
