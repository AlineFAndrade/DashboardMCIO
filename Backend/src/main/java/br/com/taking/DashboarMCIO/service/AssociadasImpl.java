package br.com.taking.DashboarMCIO.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taking.DashboarMCIO.repository.AssociadasRepository;
import br.com.taking.DashboarMCIO.model.Associadas;

@Service
public class AssociadasImpl implements AssociadasService {
	
	@Autowired
	private AssociadasRepository repository;
	
	@Override
	public Associadas incluir(Associadas associadas {
		
		//TODO: verificacao de unicidade de CPF
		String cpf = associadas.getCpf();
		
		Associadas associadasomMesmoCPF = repository.findByCpf(cpf);
		
		if(associadasComMesmoCPF == null) {
			return repository.save(associadas);	
		} else {
			return null;
		}
		
	}
	
	@Override
	public List<Associadas> obterTodos() {

		return repository.findAll();
	}
}