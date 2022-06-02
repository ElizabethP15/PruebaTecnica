package com.elizabeth.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elizabeth.demo.interfaceService.IproductoService;
import com.elizabeth.demo.interfaceService.IventaService;
import com.elizabeth.demo.modelo.Producto;
import com.elizabeth.demo.modelo.Venta;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IproductoService service;
	@Autowired
	private IventaService servicev;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto>productos=service.listar();
		model.addAttribute("productos", productos);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "form";
	}
	
	@PostMapping("/save") 
	public String save(@Validated Producto p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Producto>producto=service.ListarId(id);
		model.addAttribute("producto", producto);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	//Entidad Ventas
	@GetMapping("/listarventas")
	public String listarv(Model model) {
		List<Venta>ventas=servicev.listar();
		model.addAttribute("ventas", ventas);
		return "indexv";
	}
	
	@GetMapping("/vender")
	public String agregarv(Model model) {
		model.addAttribute("venta", new Venta());
		return "formv";
	}
	
	@PostMapping("/saveventa") 
	public String savev(@Validated Venta v, Model model) {
		servicev.save(v);
		return "redirect:/listarventas";
	}
}
