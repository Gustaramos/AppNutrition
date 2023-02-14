package br.com.nutrition.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	
	@JsonProperty("nome nutricionista")
	private String nome;
	
	@JsonProperty("id_paciente")
	private String idPaciente;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public NutricionistaResource(String nome, String idPaciente) {
		this.nome = nome;
		this.idPaciente = idPaciente;
	}
	
}