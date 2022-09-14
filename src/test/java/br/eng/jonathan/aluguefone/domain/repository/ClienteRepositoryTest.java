package br.eng.jonathan.aluguefone.domain.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.eng.jonathan.aluguefone.domain.model.Cliente;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteRepositoryTest {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Test
	public void testaMetodoRecuperarTodosOsClientes() {
		List<Cliente> clienteLista = clienteRepository.findAll();
		
		assertThat(!clienteLista.isEmpty());
	}
	
	
}
