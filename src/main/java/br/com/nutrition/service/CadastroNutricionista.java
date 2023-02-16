package br.com.nutrition.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nutrition.model.Nutricionista;

import br.com.nutrition.repository.NutricionistaRepository;
																
public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	
	//salvar o cadastro do nutricionista no servidor
	public void cadastro(Nutricionista nutricionista) {
		nutricionistaRepository.saveAndFlush(nutricionista);
		
	}
	
}
