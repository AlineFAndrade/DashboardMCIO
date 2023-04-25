package br.com.taking.DashboarMCIO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Associada;
import br.com.taking.DashboarMCIO.pitchwink.service.PitchWinkClientService;

@Service
public class AssociadaImpl implements AssociadaService {

	@Autowired
	private PitchWinkClientService pitchWinkClientService;

	@Override
	public Associada incluir(Associada associadas) {

		return null;

	}

	@Override
	public List<Associada> obterTodos() {

		try {
			return pitchWinkClientService.listAssociadas();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}