package t4h14.batch;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import t4h14.bean.*;
import t4h14.dao.*;

public class LevyHandler {


	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		LevyDAO dao = (LevyDAO)context.getBean("daoLuokka");
		
		System.out.println("-------------------");
		System.out.println("LISTATAAN KAIKKI LEVYT");
		System.out.println("-------------------");
		
		List<Levy> levyt = dao.haeKaikki();
		for (Levy l : levyt) {
			System.out.println(l.getId());
			System.out.println(l.getNimi());
			System.out.println(l.getArtisti());
			System.out.println(l.getVuosi());
			System.out.println(" ");
		}

		context.close();

	}

}
