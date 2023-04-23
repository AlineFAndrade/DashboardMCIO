package br.com.taking.DashboarMCIO.service;

import java.util.List;

import br.com.taking.DashboarMCIO.model.Alunas;

public interface AlunasService {

	Alunas incluir(Alunas alunas);

	List<Alunas> obterTodos();
	// assinatura dos metodos

}
