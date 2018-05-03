package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.beans.Proveedor;
import controller.dao.proveedor.ProveedorService;

@org.springframework.stereotype.Controller
public class Controller {

//	@Autowired
	private ProveedorService proveedorService;
	
	
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

	
	
}

