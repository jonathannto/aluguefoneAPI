package br.eng.jonathan.aluguefone.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.eng.jonathan.aluguefone.domain.model.Cliente;
import br.eng.jonathan.aluguefone.domain.repository.ClienteRepository;
import br.eng.jonathan.aluguefone.domain.service.CadastroClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api (value = "Clientes")
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	CadastroClienteService cadastroCliente;
	
	@ApiOperation(value = "Lista todos os clientes cadastrados")
	@GetMapping
	public List<Cliente> listar() {
		
		return clienteRepository.findAll();
		
	}
	
	@ApiOperation(value = "Lista um cliente especifico pelo Id")
	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscarCliente(@PathVariable Long clienteId) {
		
		Optional<Cliente> cliente = clienteRepository.findById(clienteId);
		if(cliente.isPresent()) {
		return ResponseEntity.ok(cliente.get());
		}
		
        return ResponseEntity.notFound().build();
	}
	
	@ApiOperation(value = "Insere um cliente")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) throws Exception {
		
		return cadastroCliente.salvar(cliente);
		
	}

}
