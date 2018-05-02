package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Simple{
	
	
	@GetMapping("/")
	public static String main2() {
		System.out.println("-------22");
		return "data/index";
	}
	@PostMapping("/")
	public static String main() {
		System.out.println("-------");
		return "data/index";
	}
}