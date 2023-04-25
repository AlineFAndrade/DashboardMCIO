package br.com.taking.DashboarMCIO.pitchwink.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

public interface PitchWinkClientService {

	List<Aluna> listAlunas() throws JsonProcessingException;

	List<Associada> listAssociadas() throws JsonProcessingException;

	void insertUpdateAluna(Aluna aluna) throws JsonProcessingException;

	void insertUpdateAssociada(Associada associada) throws JsonProcessingException;

}
