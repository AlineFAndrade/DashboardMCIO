package br.com.taking.DashboarMCIO.service;

import java.util.List;

import br.com.taking.DashboarMCIO.model.Associadas;

public interface AssociadasService {
	
	Associadas incluir(Associadas associadas);
	
	List<Associadas> obterTodos();
	//assinatura dos metodos

}
