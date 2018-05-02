package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple{
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public static String main() {
		System.out.println("------");
		return "index111111111111111111";
	}
	@PostMapping("/")
	public static String main2() {
		return "index";
	}
}