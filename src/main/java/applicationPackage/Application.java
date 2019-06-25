package applicationPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controllerPackage")
	public class Application {

	public static void main(String args[]) {
//		int[] []x[];
		SpringApplication.run(Application.class, args);
		
	}
}