package main;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class ControllerUsuario {

	@GetMapping("/")
	public String index(Model model) {
		System.out.println("--------------------");
		
		return "hotel/index";
	}
	
	
	@GetMapping("/hotels")
	public String hotels(Model model) {
		
		return "hotel/hotels";
//		return "error";
	}
	@GetMapping("/holidays")
	public String holidays(Model model) {
		
		return "hotel/holidays";
	}
	@GetMapping("/flights-hotels")
	public String flightsHotels(Model model) {
		
		return "hotel/flights-hotels";
	}
	@GetMapping("/bus")
	public String bus(Model model) {
		
		return "hotel/bus";
	}
	@GetMapping("/trains")
	public String trains(Model model) {
		
		return "hotel/trains";
	}
	@GetMapping("/weekend")
	public String weekend(Model model) {
		
		return "hotel/weekend";
	}
	@GetMapping("/deals")
	public String deals(Model model) {
		
		return "hotel/deals";
//		return "error";
	}
}

