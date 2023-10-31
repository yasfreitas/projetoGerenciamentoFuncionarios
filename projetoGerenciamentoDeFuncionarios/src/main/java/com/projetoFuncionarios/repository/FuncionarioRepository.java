package com.projetoFuncionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoFuncionarios.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
