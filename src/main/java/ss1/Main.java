package ss1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("context.xml");
		Logik log = (Logik) con.getBean("logik");
		log.d(53.7);
	}

}
