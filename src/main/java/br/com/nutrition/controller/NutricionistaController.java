package br.com.nutrition.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.nutrition.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;

@RestController
public class NutricionistaController {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepositoy;
	
	@GetMapping(path = "api/nutricionista-id/{}")
	public ResponseEntity<Optional<Nutricionista>> buscarNutricionistaPorId(
			@PathVariable(name = "id",  required = true)Long idNutricionista) {
		return ResponseEntity.
				ok(nutricionistaRepositoy.findById(idNutricionista));
		
		
	}
		
}
