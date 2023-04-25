package br.com.taking.DashboarMCIO.pitchwink.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

@Service
public class PitchWinkClientServiceMock implements PitchWinkClientService {

	public List<Aluna> listAlunas() throws JsonProcessingException {
		
		List<Aluna> alunas = new ArrayList<>();
		Aluna aluna1 = new Aluna();
		aluna1.setName("Aline Mock Aluna");
		alunas.add(aluna1);
		
		return alunas;
	}

	public List<Associada> listAssociadas() throws JsonProcessingException {
		
		List<Associada> associadas = new ArrayList<>();
		Associada associada1 = new Associada();
		associada1.setName("Aline Mock Associada");
		associadas.add(associada1);
		
		return associadas;
	}

	public void insertUpdateAluna(Aluna aluna) throws JsonProcessingException {
		// TODO Auto-generated method stub

	}

	public void insertUpdateAssociada(Associada associada) throws JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
