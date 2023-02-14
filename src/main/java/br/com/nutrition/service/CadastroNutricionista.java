package br.com.nutrition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nutrition.datasource.model.Nutricionista;
import br.com.nutrition.repository.NutricionistaRepository;
																
public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	@GetMapping (path = "id_paciente")
	public void buscarPorId() {
		nutricionistaRepository.
	}
	
}
