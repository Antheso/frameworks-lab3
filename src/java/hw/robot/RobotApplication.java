package hw.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobotApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
		MyRobotT1000 robot = (MyRobotT1000) context.getBean("robot");
		robot.aliveImitation();
	}

}
