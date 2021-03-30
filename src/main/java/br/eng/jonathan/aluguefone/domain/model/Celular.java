package br.eng.jonathan.aluguefone.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Celular {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JsonBackReference
	private Cliente cliente;
	private String modelo;
	private String marca;
	@Column(name = "num_serie")
	private String numSerie;
	@Enumerated(EnumType.STRING)
	private StatusCelular status;
	
	
}
