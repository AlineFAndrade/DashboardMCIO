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
import br.com.taking.DashboarMCIO.pitchwink.model.Associada;
import br.com.taking.DashboarMCIO.service.AssociadaService;

@CrossOrigin
@RestController
public class AssociadaController {

	@Autowired
	private AssociadaService service;

	@RequestMapping(value = "/associadas", method = RequestMethod.POST)
	public ResponseEntity<Object> Post(@RequestBody Associada associada) {

		Associada associadasIncluido = service.incluir(associada);

		if (associadasIncluido != null) {
			return new ResponseEntity<Object>(associadasIncluido, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("CPF ja cadastrado!", HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/associadas", method = RequestMethod.GET)
	public ResponseEntity<List<Associada>> GetAll() {

		List<Associada> resultado = service.obterTodos();

		return new ResponseEntity<List<Associada>>(resultado, HttpStatus.OK);

	}

}
