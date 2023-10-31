package com.projetoFuncionarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoFuncionarios.entities.Funcionario;
import com.projetoFuncionarios.repository.FuncionarioRepository;

@Service  
public class FuncionarioService {  
	private final FuncionarioRepository funcionarioRepository;  

	@Autowired  
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {  
		this.funcionarioRepository = funcionarioRepository;  
	}  

	public List<Funcionario> buscaTodosFuncionarios(){  
		return funcionarioRepository.findAll();  
	} 
	
	public Funcionario buscaFuncionarioById(Long id) {  
		Optional <Funcionario> funcionario = funcionarioRepository.findById(id);  
		return funcionario.orElse(null);  
		}  

	public Funcionario salvaFuncionario(Funcionario funcionario) {  
	return funcionarioRepository.save(funcionario);  
	}  

	public Funcionario alterarFuncionario(Long id, Funcionario alterarFuncionario) {  
	Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(id);  
	if(existeFuncionario.isPresent()) {  
		alterarFuncionario.setId(id);  
		return funcionarioRepository.save(alterarFuncionario);  
	}  
	return null;  
	}  

	public boolean apagarFuncionario(Long id) {  
	Optional <Funcionario> existeFuncionario = funcionarioRepository.findById(id);  
	if(existeFuncionario.isPresent()) {  
		funcionarioRepository.deleteById(id);  
		return true;  
	}  
	return false;  
	}  

} 