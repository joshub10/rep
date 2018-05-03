package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import controller.beans.producto.Producto;
import controller.beans.producto.ProductoT;
import controller.dao.producto.ProductoService;

@org.springframework.stereotype.Controller
public class ControllerProducto {

	@Autowired
	private ProductoService service;
	@Autowired
	private ProductoT obT;
	
	
	private String path="/web";
	
	@GetMapping("/productos")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Producto> iterable= service.getAll();
		
		model.addAttribute("iterable",iterable);
		
		System.out.println("Prod:"+iterable);
		
		return "web/productos";
	}
	
	
	
	
	@GetMapping("/productosAlta")
	public String AltaGet( Model model) {

		
		model.addAttribute("proveedor",obT);
		
		
		return "web/productosAlta";
	}
	
	@PostMapping("/productosAlta")
	public String AltaPost(ProductoT productoT, Model model) {
	
		boolean b= service.create(productoT.parseEntity());
		System.out.println("proveedoresAlta: "+b);
		
		model.addAttribute("res", b);
		model.addAttribute("producto",productoT);
		
		return "web/productosAlta";
	}

	
	
}

