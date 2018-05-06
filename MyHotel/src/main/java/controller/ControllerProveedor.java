package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.beans.Proveedore;
import controller.beans.ProveedorT;
import controller.dao.proveedor.ProveedorService;

@org.springframework.stereotype.Controller
public class ControllerProveedor {

	@Autowired
	private ProveedorService service;
	
	@Autowired
	private ProveedorT obT;
	
	
	@GetMapping("/proveedores")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Proveedore> iterable= service.getAll();
		
		model.addAttribute("proveedores",iterable);
		
		System.out.println("Prov:"+iterable);
		
		return "web/proveedores";
	}

	
	@GetMapping("/proveedoresAlta")
	public String AltaGet( Model model) {

		model.addAttribute("proveedor",obT);
		
		
		return "web/proveedoresAlta";
	}
	@PostMapping("/proveedoresAlta")
	public String AltaPost(ProveedorT proveedorT, Model model) {
	
		boolean b= service.create(proveedorT.parseEntity());
		System.out.println("proveedoresAlta: "+b);
		
		model.addAttribute("res", b);
		model.addAttribute("proveedor",proveedorT);
		
		return "web/proveedoresAlta";
	}

}
