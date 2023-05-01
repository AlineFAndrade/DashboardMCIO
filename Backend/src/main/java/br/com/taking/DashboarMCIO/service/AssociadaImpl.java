package br.com.taking.DashboarMCIO.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.taking.DashboarMCIO.pitchwink.model.Associada;
import br.com.taking.DashboarMCIO.pitchwink.service.PitchWinkClientService;

@Service
public class AssociadaImpl implements AssociadaService {

	@Autowired
	private PitchWinkClientService pitchWinkClientService;

	@Override
	public void incluir(MultipartFile associadasCSV) {

		try (BufferedReader fileReader = new BufferedReader(
				new InputStreamReader(associadasCSV.getInputStream(), "UTF-8"));
				
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<Associada> associadas = new ArrayList<Associada>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				Associada associada = new Associada();
				//nao tem atributo para carimbo, coluna A(0)
				associada.setName(csvRecord.get(1)); // Coluna B é o Nome
				associada.setEmail(csvRecord.get(2)); // Coluna C é o email
				associada.setMobile(csvRecord.get(3)); //Coluna D  celular
				associada.setXvPais(csvRecord.get(4)); //Coluna E pais
				associada.setXvUf(csvRecord.get(5)); //COluna F estado
				associada.setXvCidade(csvRecord.get(6)); //COluna G cidade
				associada.setXvAreaAtua(csvRecord.get(7)); // Coluna H é atuacao
				associada.setXvEspOutraArea(csvRecord.get(8)); //COluna I em caso de "outros"
				associada.setXvCargoTecnologia(csvRecord.get(9)); //COluna J cargo
				associada.setXvSegmento(csvRecord.get(10)); //COluna K segmento
				//nao encontramos atributo para "area de interesse"
				associada.setXvOutraAssociacao(csvRecord.get(12)); //COluna M se faz volunt em outr ong
				associada.setXvPilarMcio(csvRecord.get(13)); //Coluna N pilar mcio que atua
				associadas.add(associada);
			}

			for (Associada associada : associadas) {
				pitchWinkClientService.insertUpdateAssociada(associada);
			}
			
		} catch (IOException e) {
			throw new RuntimeException("Tivemos problemas: " + e.getMessage());
		}
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