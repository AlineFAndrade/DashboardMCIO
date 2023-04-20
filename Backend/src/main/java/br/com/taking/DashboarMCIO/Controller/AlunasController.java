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
import br.com.taking.DashboarMCIO.model.Alunas;


@CrossOrigin
@RestController
public class AlunasController {
	
	@Autowired
	private AlunasService service;
	
	@RequestMapping(value = "/alunas", method = RequestMethod.POST)
	public ResponseEntity<Object> Post(@RequestBody Alunas alunas){
		
		Alunas alunasIncluido = service.incluir(alunas);
		
		if(alunasIncluido != null) {
			return new ResponseEntity<Object>(alunasIncluido, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("CPF ja cadastrado!", HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/alunas", method = RequestMethod.GET)
	public ResponseEntity<List<Alunas>> GetAll(){
		
		List<Alunas> resultado = service.obterTodos();
		
		return new ResponseEntity<List<Alunas>>(resultado, HttpStatus.OK);
		
	}

}
