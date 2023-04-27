package br.com.taking.DashboarMCIO.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;

public interface AlunaService {

	void incluir(MultipartFile aluna);

	List<Aluna> obterTodos();
	// assinatura dos metodos

}
