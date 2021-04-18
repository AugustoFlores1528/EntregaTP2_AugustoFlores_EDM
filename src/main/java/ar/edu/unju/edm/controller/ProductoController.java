package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	ProductoService iProductoService;
	
	@GetMapping("/producto")
	public String cargarP(Model model) {
		model.addAttribute("unProducto", iProductoService.obtenerNuevoP());
		return ("producto");
	}
	
	@PostMapping("/producto")
	public String guardarNuevoP(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarP(nuevoProducto);
		System.out.println(iProductoService.obtenerTodosP().get(0).getMarcaP());
		model.addAttribute("productos", iProductoService.obtenerTodosP());
		return "resultado";
	}
	
	@GetMapping("/ultimo")
	public String cargarUltimoP(Model model) {
		model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoP());
		return("mostrar-ultimo");
	}

	@GetMapping("/volver")
	public String cargarNuevoP(Model model) {;
		return("redirect:/producto");
	}
	
}
