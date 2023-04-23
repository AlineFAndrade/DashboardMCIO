package br.com.taking.DashboarMCIO.pitchwink.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

@Service
public class PitchWinkClientServiceMock implements PitchWinkClientService {

	public List<Aluna> listAlunas() throws JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Associada> listAssociadas() throws JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertUpdateAluna(Aluna aluna) throws JsonProcessingException {
		// TODO Auto-generated method stub

	}

	public void insertUpdateAssociada(Associada associada) throws JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
