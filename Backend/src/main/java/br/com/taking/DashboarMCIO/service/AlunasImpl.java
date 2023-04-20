package br.com.taking.DashboarMCIO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.DashboarMCIO.repository.AlunasRepository;
import br.com.taking.DashboarMCIO.model.Alunas;

@Service
public class AlunasImpl implements AlunasService {
	
	@Autowired
	private AlunasRepository repository;
	
	@Override
	public Alunas incluir(Alunas alunas) {
		
		//TODO: verificacao de unicidade de CPF
		String cpf = alunas.getCpf();
		
		Alunas alunasComMesmoCPF = repository.findByCpf(cpf);
		
		if(alunasComMesmoCPF == null) {
			return repository.save(alunas);	
		} else {
			return null;
		}
		
	}
	
	@Override
	public List<Alunas> obterTodos() {

		return repository.findAll();
	}
}
