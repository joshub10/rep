package controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import controller.beans.CategoriaT;
import controller.beans.Compra;
import controller.dao.compra.CompraService;

@org.springframework.stereotype.Controller
public class ControllerCompra {

	@Autowired
	private CompraService service;
	
	@Autowired
	CategoriaT categoriaT;	
	
	@PostConstruct
	private void met() {
		System.out.println("===ControllerCompra===");

	}
	
	@GetMapping("/compras")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Compra> iterable= service.getAll();
		
		model.addAttribute("iterable",iterable);
		
		System.out.println("categorias:"+iterable);
		
		return "web/compras";
	}
	
}

