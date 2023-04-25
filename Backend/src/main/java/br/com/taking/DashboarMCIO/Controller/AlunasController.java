package br.com.taking.DashboarMCIO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.DashboarMCIO.pitchwink.model.Aluna;
import br.com.taking.DashboarMCIO.service.AlunaService;

@CrossOrigin
@RestController
public class AlunasController {

	@Autowired
	private AlunaService service;

	@RequestMapping(value = "/alunas", method = RequestMethod.POST)
	public ResponseEntity<Object> Post(@RequestBody Aluna alunas) {

		Aluna alunasIncluido = service.incluir(alunas);

		if (alunasIncluido != null) {
			return new ResponseEntity<Object>(alunasIncluido, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("CPF ja cadastrado!", HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/alunas", method = RequestMethod.GET)
	public ResponseEntity<List<Aluna>> GetAll() {

		List<Aluna> resultado = service.obterTodos();

		return new ResponseEntity<List<Aluna>>(resultado, HttpStatus.OK);

	}

}
