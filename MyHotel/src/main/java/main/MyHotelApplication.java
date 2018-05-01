package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages= {"controller"})
public class MyHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHotelApplication.class, args);
	}
}
