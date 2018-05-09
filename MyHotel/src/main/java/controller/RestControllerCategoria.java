package controller;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import controller.beans.Categoria;
import controller.beans.CategoriaT;
import controller.dao.categoria.CategoriaService;

@RestController
@RequestMapping(value = "/clases")
public class RestControllerCategoria {

	@Autowired
	private CategoriaService service;
	
	@Autowired
	CategoriaT categoriaT;	
	



	
	@RequestMapping(value="/{time}", method = RequestMethod.GET)
    public @ResponseBody String getMyData( @PathVariable long time) {
		System.out.println("--------------fewefwe------"+time);

        return "REST GET Call !!!";
    }
	@RequestMapping( method = RequestMethod.GET)
	public String proveedores(Model model) {
		System.out.println("--------------fewefwe------");
//		Iterable<Categoria> iterable= service.getAll();
//		
//		model.addAttribute("iterable",iterable);
//		
//		System.out.println("categorias:"+iterable);
		
		return "web";
	}

	






}
