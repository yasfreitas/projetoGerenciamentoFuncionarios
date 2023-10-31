package com.projetoFuncionarios.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionarios")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	private String rg;
	
	@NotNull
	@NotBlank
	private String cpf;
	
	@NotNull
	@NotBlank
	private String endereco;
	
	@NotNull
	@NotBlank
	private String telefone;
	
	@NotNull
	@NotBlank
	private String cargo;
	
	@NotNull
	private double salario;

}
