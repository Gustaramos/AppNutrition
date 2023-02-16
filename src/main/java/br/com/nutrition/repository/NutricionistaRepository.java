package br.com.nutrition.repository;

import org.springframework.data.jpa.repository.*;

import br.com.nutrition.model.Nutricionista;

public interface NutricionistaRepository 
	extends JpaRepository <Nutricionista, Long> {
}
