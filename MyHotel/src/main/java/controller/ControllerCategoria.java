package controller;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controller.beans.Categoria;
import controller.beans.CategoriaT;
import controller.dao.categoria.CategoriaService;

@org.springframework.stereotype.Controller
public class ControllerCategoria implements InitializingBean{

	@Autowired
	private CategoriaService service;
	
	@Autowired
	CategoriaT categoriaT;	
	
	private HttpSession session;
	@Autowired
	public ControllerCategoria(HttpSession session) {
		this.session=session;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
	
		
	}
	
	@GetMapping("/categorias")
	public String proveedores(Model model) {
		System.out.println("--------------------");
		Iterable<Categoria> iterable= service.getAll();
		
		model.addAttribute("iterable",iterable);
		
		System.out.println("categorias:"+iterable);
		
		return "web/categorias";
	}

	
	@GetMapping("/categoriasAlta")
	public String altaGet( Model model) {

		model.addAttribute("categoria",categoriaT);
		
		
		return "web/categoriasAlta";
	}
	@PostMapping("/categoriasAlta")
	public String altaPost(CategoriaT categoriaT, Model model) {
	
		boolean b= service.create(categoriaT.parseEntity());
		System.out.println("categoriasAlta: "+b);
		
		model.addAttribute("res", b);
		model.addAttribute("categorias",categoriaT);
		
		return "web/categoriasAlta";
	}





}
