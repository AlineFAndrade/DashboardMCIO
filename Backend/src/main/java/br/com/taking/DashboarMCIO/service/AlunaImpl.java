package br.com.taking.DashboarMCIO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.service.PitchWinkClientService;


@Service
public class AlunaImpl implements AlunaService {

	@Autowired
	private PitchWinkClientService pitchWinkClientService;
	
	@Override
	public Aluna incluir(Aluna aluna) {

		return null;

	}

	@Override
	public List<Aluna> obterTodos() {

		try {
			return pitchWinkClientService.listAlunas();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
