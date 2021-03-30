package br.eng.jonathan.aluguefone.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eng.jonathan.aluguefone.domain.model.Cliente;
import br.eng.jonathan.aluguefone.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) throws Exception {
		
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new Exception("Cliente existente!");
		}
		return clienteRepository.save(cliente);
	}
	
}
