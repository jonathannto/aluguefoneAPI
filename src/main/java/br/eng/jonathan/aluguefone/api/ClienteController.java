package br.eng.jonathan.aluguefone.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eng.jonathan.aluguefone.domain.model.Cliente;
import br.eng.jonathan.aluguefone.domain.repository.ClienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api (value = "Clientes")
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@ApiOperation(value = "listagem de todos os clientes cadastrados")
	@GetMapping
	public List<Cliente> listar() {
		
		return clienteRepository.findAll();
		
	}

}
