package br.com.taking.DashboarMCIO.pitchwink.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

@Service
public class PitchWinkClientServiceMock implements PitchWinkClientService {
	
	List<Aluna> alunas = new ArrayList<>();
	List<Associada> associadas = new ArrayList<>();

	public List<Aluna> listAlunas() throws JsonProcessingException {
		return alunas;
	}

	public List<Associada> listAssociadas() throws JsonProcessingException {
		return associadas;
	}

	public void insertUpdateAluna(Aluna aluna) throws JsonProcessingException {
		alunas.add(aluna);
	}

	public void insertUpdateAssociada(Associada associada) throws JsonProcessingException {
		associadas.add(associada);
	}

}
