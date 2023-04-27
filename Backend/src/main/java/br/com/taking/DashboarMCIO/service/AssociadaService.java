package br.com.taking.DashboarMCIO.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

public interface AssociadaService {

	void incluir(MultipartFile associada);

	List<Associada> obterTodos();
	// assinatura dos metodos

}
