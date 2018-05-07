package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import controller.beans.Fabricante;
import controller.beans.FabricanteT;
import controller.beans.ProveedorT;
import controller.dao.fabricante.FabricanteService;

@org.springframework.stereotype.Controller
public class ControllerFabricante {

	@Autowired
	private FabricanteService service;
	
	@Autowired
	private ProveedorT obT;
	
	
	@GetMapping("/fabricantes")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Fabricante> iterable= service.getAll();
		
		model.addAttribute("iterable",iterable);
		
		System.out.println("FAb:"+iterable);
		
		return "web/fabricantes";
	}

	
	@GetMapping("/fabricantesAlta")
	public String AltaGet( Model model) {

		model.addAttribute("fabricate",obT);
		
		
		return "web/fabricatesAlta";
	}
	@PostMapping("/fabricantesAlta")
	public String AltaPost(FabricanteT fabricanteT, Model model) {
	
		boolean b= service.create(fabricanteT.parseEntity());
		System.out.println("fabricantesAlta: "+b);
		
		model.addAttribute("res", b);
		model.addAttribute("ob",fabricanteT);
		
		return "web/fabricantesAlta";
	}

}
