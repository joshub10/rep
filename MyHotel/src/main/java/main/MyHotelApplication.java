package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"controller.dao.proveedor","controller.dao.producto","controller.dao.categoria","controller.dao.compra","controller.dao.fabricante","controller.dao.usuario"})
@EntityScan("controller.beans")
@ComponentScan(basePackages= {"controller","controller.dao","controller.beans","controller.dao.producto","controller.dao.proveedor"})
public class MyHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHotelApplication.class, args);
	}
}
