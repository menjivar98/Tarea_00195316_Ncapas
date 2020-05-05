package com.uca.tareas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.taras.domain.Product;

@Controller
public class ProductController {
	
	private List<Product> productos = new ArrayList<Product>();
	
	@GetMapping("/producto")
	public ModelAndView compraProducto() {
		ModelAndView mav = new ModelAndView();
		
		productos.add(new Product(0, "Samsung", 25));
		productos.add(new Product(1, "Apple", 10));
		productos.add(new Product(2, "Huawei", 30));
		productos.add(new Product(1, "Xiami", 40));
		productos.add(new Product(1, "LG", 35));
		
		mav.setViewName("producto");
		mav.addObject("product", new Product());
		mav.addObject("productos", productos);
		
		return mav;
				
	}
	
	@PostMapping("/validar")
	public ModelAndView validar(Product product) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", productos.get(product.getId()).getNombre());
		
		if(productos.get(product.getId()).getCantidad() >= product.getCantidad() && product.getCantidad() > 0) { mav.setViewName("compra"); }
		else {
			mav.setViewName("error");
		}
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
