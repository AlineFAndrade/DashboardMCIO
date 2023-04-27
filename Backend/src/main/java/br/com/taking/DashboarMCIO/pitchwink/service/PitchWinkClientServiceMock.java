package br.com.taking.DashboarMCIO.pitchwink.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;

@Service
public class PitchWinkClientServiceMock implements PitchWinkClientService {
	
	List<Aluna> alunas = mockAlunas();
	List<Associada> associadas = mockAssociadas();

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
	
	private List<Aluna> mockAlunas() {
		List<Aluna> alunas = new ArrayList<>();
		
		Aluna aluna1 = new Aluna();
		aluna1.setName("Aline Amorim de Andrade");
		aluna1.setXvPaisAluna("Brasil");
		aluna1.setXvUfAluna("SP");
		aluna1.setXvContratadaParceiroMcio("S");
		aluna1.setXvGrauEscolaridadeAluna("Superior");
		
		alunas.add(aluna1);
		
		Aluna aluna2 = new Aluna();
		aluna2.setName("Carla de Souza");
		aluna2.setXvPaisAluna("Brasil");
		aluna2.setXvUfAluna("MG");
		aluna2.setXvContratadaParceiroMcio("S");
		aluna2.setXvGrauEscolaridadeAluna("MBA");
		
		alunas.add(aluna2);
		
		Aluna aluna3 = new Aluna();
		aluna3.setName("Adriana Valerio");
		aluna3.setXvPaisAluna("Espanha");
		aluna3.setXvUfAluna("Barcelona");
		aluna3.setXvContratadaParceiroMcio("N");
		aluna3.setXvGrauEscolaridadeAluna("Superior");
		
		alunas.add(aluna3);
		
		Aluna aluna4 = new Aluna();
		aluna4.setName("Juliana Mignac Maia");
		aluna4.setXvPaisAluna("Brasil");
		aluna4.setXvUfAluna("Pernambuco");
		aluna4.setXvContratadaParceiroMcio("S");
		aluna4.setXvGrauEscolaridadeAluna("Pós Graduacao");
		
		alunas.add(aluna4);
		
		Aluna aluna5 = new Aluna();
		aluna5.setName("Ana Paula Corazzini");
		aluna5.setXvPaisAluna("Brasil");
		aluna5.setXvUfAluna("SP");
		aluna5.setXvContratadaParceiroMcio("N");
		aluna5.setXvGrauEscolaridadeAluna("Superior");
		
		alunas.add(aluna5);
		
		Aluna aluna6 = new Aluna();
		aluna6.setName("Sandra Regina Martins");
		aluna6.setXvPaisAluna("Brasil");
		aluna6.setXvUfAluna("RJ");
		aluna6.setXvContratadaParceiroMcio("N");
		aluna6.setXvGrauEscolaridadeAluna("Superior");
		
		alunas.add(aluna6);
		
		Aluna aluna7 = new Aluna();
		aluna7.setName("Monica Moreira");
		aluna7.setXvPaisAluna("Brasil");
		aluna7.setXvUfAluna("PR");
		aluna7.setXvContratadaParceiroMcio("S");
		aluna7.setXvGrauEscolaridadeAluna("MBA");
		
		alunas.add(aluna7);
		
		Aluna aluna8 = new Aluna();
		aluna8.setName("Vivian Secco");
		aluna8.setXvPaisAluna("Peru");
		aluna8.setXvUfAluna("Lima");
		aluna8.setXvContratadaParceiroMcio("S");
		aluna8.setXvGrauEscolaridadeAluna("Superior");
		
		alunas.add(aluna8);
		
		Aluna aluna9 = new Aluna();
		aluna9.setName("Eliana Maria dos Santos");
		aluna9.setXvPaisAluna("Brasil");
		aluna9.setXvUfAluna("RN");
		aluna9.setXvContratadaParceiroMcio("N");
		aluna9.setXvGrauEscolaridadeAluna("Médio");
		
		alunas.add(aluna9);
		
		Aluna aluna10 = new Aluna();
		aluna10.setName("Tania Mara Leal");
		aluna10.setXvPaisAluna("Estados Unidos");
		aluna10.setXvUfAluna("Carolina do Norte");
		aluna10.setXvContratadaParceiroMcio("S");
		aluna10.setXvGrauEscolaridadeAluna("Doutorado");
		
		alunas.add(aluna10);
		return alunas;
	}
	
	private List<Associada> mockAssociadas() {
		List<Associada> associadas = new ArrayList<>();
		
		Associada associada1 = new Associada();
		associada1.setName("Luiza Marinho");
		associada1.setXvPais("Brasil");
		associada1.setXvUf("SP");
		associada1.setXvSegmento("Varejo");
		associada1.setXvPilarMcio("Diretoria");
		
		associadas.add(associada1);
		
		Associada associada2 = new Associada();
		associada2.setName("Marina Moreira Gusmao");
		associada2.setXvPais("Brasil");
		associada2.setXvUf("SP");
		associada2.setXvSegmento("Energia");
		associada2.setXvPilarMcio("Nao atua como voluntária");
		
		associadas.add(associada2);
		
		Associada associada3 = new Associada();
		associada3.setName("Gabriela Tabosa dos Reis");
		associada3.setXvPais("Brasil");
		associada3.setXvUf("SP");
		associada3.setXvSegmento("Seguros");
		associada3.setXvPilarMcio("Diretoria");
		
		associadas.add(associada3);
		
		Associada associada4 = new Associada();
		associada4.setName("Aline Ramos Ferreira");
		associada4.setXvPais("Brasil");
		associada4.setXvUf("RJ");
		associada4.setXvSegmento("Energia");
		associada4.setXvPilarMcio("Parceria");
		
		associadas.add(associada4);
		
		Associada associada5 = new Associada();
		associada5.setName("Fernanda Cristina de Franca");
		associada5.setXvPais("Brasil");
		associada5.setXvUf("SP");
		associada5.setXvSegmento("Energia");
		associada5.setXvPilarMcio("Mentoria e gestao de projetos");
		
		associadas.add(associada5);
		
		Associada associada6 = new Associada();
		associada6.setName("Amanda Vasconcelos");
		associada6.setXvPais("Brasil");
		associada6.setXvUf("RJ");
		associada6.setXvSegmento("Varejo");
		associada6.setXvPilarMcio("Diretoria");
		
		associadas.add(associada6);
		
		Associada associada7 = new Associada();
		associada7.setName("Lílian Barreto das Mecedes");
		associada7.setXvPais("Brasil");
		associada7.setXvUf("SP");
		associada7.setXvSegmento("Industria Alimentícia");
		associada7.setXvPilarMcio("Parceria");
		
		associadas.add(associada7);
		
		Associada associada8 = new Associada();
		associada8.setName("Bruna Nogueira da Silva");
		associada8.setXvPais("Brasil");
		associada8.setXvUf("SP");
		associada8.setXvSegmento("Industria Alimentícia");
		associada8.setXvPilarMcio("Mentoria e Gestao de Projetos");
		
		associadas.add(associada8);
		
		Associada associada9 = new Associada();
		associada9.setName("Maria das Gracas de Lima Cavalcanti");
		associada9.setXvPais("Brasil");
		associada9.setXvUf("SP");
		associada9.setXvSegmento("Industria Alimentícia");
		associada9.setXvPilarMcio("Diretoria");
		
		associadas.add(associada9);
		
		Associada associada10 = new Associada();
		associada10.setName("Paula de Lacerda");
		associada10.setXvPais("Brasil");
		associada10.setXvUf("RJ");
		associada10.setXvSegmento("Varejo");
		associada10.setXvPilarMcio("Mentoria e Gestao de Projetos");
		
		associadas.add(associada10);
		return associadas;
	}

}
