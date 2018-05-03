package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.beans.proveedor.Proveedor;
import controller.beans.proveedor.ProveedorT;
import controller.dao.proveedor.ProveedorService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	private ProveedorT proveedorT;
	
	@RequestMapping(value = "/proveedoresLista", method = RequestMethod.GET)
	public Iterable<Proveedor> listaProveedores(){
		
		return proveedorService.getAll();
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println("--------------------");
		
		return "web/index";
	}
	@GetMapping("/proveedores")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Proveedor> iterable= proveedorService.getAll();
		
		model.addAttribute("proveedores",iterable);
		
		System.out.println("Prov:"+iterable);
		
		return "web/proveedores";
	}
	
	
	@GetMapping("/proveedoresAlta")
	public String proveedoresAltaGet( Model model) {

		
		model.addAttribute("proveedor",proveedorT);
		
		
		return "web/proveedoresAlta";
	}
	@PostMapping("/proveedoresAlta")
	public String proveedoresAltaPost(ProveedorT proveedorT, Model model) {
	
		boolean b= proveedorService.create(proveedorT.parseEntity());
		System.out.println("proveedoresAlta: "+b);
		
		model.addAttribute("res", b);
		model.addAttribute("proveedor",proveedorT);
		
		return "web/proveedoresAlta";
	}

	
	
}

