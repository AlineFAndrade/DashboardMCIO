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

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.pitchwink.service.PitchWinkClientService;


@Service
public class AlunaImpl implements AlunaService {

	@Autowired
	private PitchWinkClientService pitchWinkClientService;
	
	@Override
	public void incluir(MultipartFile alunasCSV) {

		try (BufferedReader fileReader = new BufferedReader(
				new InputStreamReader(alunasCSV.getInputStream(), "UTF-8"));
				
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<Aluna> alunas = new ArrayList<Aluna>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				Aluna aluna = new Aluna();
				aluna.setName(csvRecord.get(1)); // Coluna B(2) é o Nome
				aluna.setEmail(csvRecord.get(2)); // Coluna C é o email 
				aluna.setXvPaisAluna(csvRecord.get(4));
				aluna.setXvUfAluna(csvRecord.get(5));
				aluna.setXvGrauEscolaridadeAluna(csvRecord.get(3));
				alunas.add(aluna);
			}

			for (Aluna aluna : alunas) {
				pitchWinkClientService.insertUpdateAluna(aluna);
			}
			
		} catch (IOException e) {
			throw new RuntimeException("Tivemos problemas: " + e.getMessage());
		}

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
