package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import controller.dao.categoria.CategoriaService;
import controller.dao.clases.ClaseService;

@org.springframework.stereotype.Controller

public class Controller{

	
	@Autowired
	private CategoriaService service;

	@Autowired
	private ClaseService serviceCl;

	
	@GetMapping("/")
	public String index(Model model,HttpSession session) {
		System.out.println("--------------------");
		session.setAttribute("categorias", service.getAll());
		session.setAttribute("clases", serviceCl.getAll());
		
		return "web/index";
	}

	
	
}

