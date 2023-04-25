package br.com.taking.DashboarMCIO.service;

import java.util.List;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;

public interface AlunaService {

	Aluna incluir(Aluna alunas);

	List<Aluna> obterTodos();
	// assinatura dos metodos

}
