package br.com.nutrition.model;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable{

	private static final long serialVersionUID = 2638887198670244578L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private LocalDate idade;
	
	@Column(name = "codigo_registro")
	private String codigoRegistro;
	
	@Column(name = "id_paciente")
	private Long idPaciente;
	
	
	public Nutricionista() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	
	public Long getId_paciente() {
		return idPaciente;
	}
	public void setId_paciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
}

