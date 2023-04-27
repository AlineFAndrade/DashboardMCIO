package br.com.taking.DashboarMCIO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.service.AlunaService;

@RestController
public class AlunasController {

	@Autowired
	private AlunaService service;

	@RequestMapping(value = "/alunas", method = RequestMethod.POST)
	public ResponseEntity<Object> Post(@RequestParam("file") MultipartFile file) {
		String message = "";

		if ("text/csv".equals(file.getContentType())) {
			try {
				service.incluir(file);
				message = "Upload concluido: " + file.getOriginalFilename();
				return ResponseEntity.status(HttpStatus.OK).body(message);
			} catch (Exception e) {
				message = "Falha no upload: " + file.getOriginalFilename() + "!";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
			}
		}
		
		message = "Somente arquivos CSV são permitidos.";
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);

	}

	@RequestMapping(value = "/alunas", method = RequestMethod.GET)
	public ResponseEntity<List<Aluna>> GetAll() {

		List<Aluna> resultado = service.obterTodos();

		return new ResponseEntity<List<Aluna>>(resultado, HttpStatus.OK);

	}

}
