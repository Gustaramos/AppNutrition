package br.com.nutrition.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nutrition.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;

@RestController
@RequestMapping(value = "api")
public class NutricionistaController {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepositoy;
	
	@GetMapping(path = "nutricionista")
	public List <Nutricionista>buscarNutricionistas(){
		return  nutricionistaRepositoy.findAll();		
	}
		
	@GetMapping(path = "nutricionista/id{id}")
	public Optional<Nutricionista>buscarNutricionistaPorId(
			@PathVariable(name = "id", required = true)Long id){
		return nutricionistaRepositoy.findById(id);		
	}
}
