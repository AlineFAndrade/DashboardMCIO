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
import br.com.taking.DashboarMCIO.model.Associadas;
import br.com.taking.DashboarMCIO.service.AssociadasService;

@CrossOrigin
@RestController
public class AssociadasController {
	
	@Autowired
	private AssociadasService service;
	@RequestMapping(value = "/associadas", method = RequestMethod.POST)
	public ResponseEntity<Object> Post(@RequestBody Associadas associadas){
		
		Associadas associadasIncluido = service.incluir(associadas);
		
		if(associadasIncluido != null) {
			return new ResponseEntity<Object>(associadasIncluido, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("CPF ja cadastrado!", HttpStatus.BAD_REQUEST);
		}

	}
	@RequestMapping(value = "/associadas", method = RequestMethod.GET)
	public ResponseEntity<List<Associadas>> GetAll(){
		
		List<Associadas> resultado = service.obterTodos();
		
		return new ResponseEntity<List<Associadas>>(resultado, HttpStatus.OK);
		
	}
	
	
}
