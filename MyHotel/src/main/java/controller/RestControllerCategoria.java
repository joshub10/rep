package controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import controller.beans.CategoriaT;
import controller.beans.Clas;
import controller.beans.Usuario;
import controller.dao.categoria.CategoriaService;
import controller.dao.clases.ClaseService;

@RestController
@RequestMapping(value = "/categorias/clases")
public class RestControllerCategoria {

	@Autowired
	private ClaseService service;
	
	@Autowired
	CategoriaT categoriaT;	
	



	
	@PostMapping( value="/post")
	public @ResponseBody ResponseEntity<?> getMyData(@RequestParam("operacion") String op,@RequestParam("val") String val) {
		System.out.println(op+" "+val);
		
		List<Clas> it=service.getAll();
		
		System.out.println(" "+it);
		return ResponseEntity.ok(new Usuario());
	}
	@GetMapping(value="/post")
	public  String getMyData2(@RequestBody Object ob) {
		System.out.println("--------------fewefwe---GET---"+ob);
		
		return "REST GET Call !!!";
	}


	






}
