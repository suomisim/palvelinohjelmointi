package h3t13.kello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GmtIsoKelloTest {

	private GmtIsoKello kello;
	
	@Before
	public void createKello() {
		KelloLahde mockLahde = new MockKelloLahde();
		this.kello = new GmtIsoKello(mockLahde);
	}

	@Test
	public void testGetAika() {
		String actual  = this.kello.getAika();
		String expected = "11:22:33"; //GMT
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetPvm() {
		String actual  = this.kello.getPvm();
		String expected = "1970-01-02";
		assertEquals(expected, actual);
	}
}