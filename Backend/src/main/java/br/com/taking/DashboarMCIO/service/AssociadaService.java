package br.com.taking.DashboarMCIO.service;

import java.util.List;

import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

public interface AssociadaService {

	Associada incluir(Associada associada);

	List<Associada> obterTodos();
	// assinatura dos metodos

}
