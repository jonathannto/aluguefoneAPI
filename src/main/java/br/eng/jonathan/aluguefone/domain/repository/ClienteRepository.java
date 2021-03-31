package br.eng.jonathan.aluguefone.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.eng.jonathan.aluguefone.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente findByEmail(String email);
	
	List<Cliente> findByNomeContaining(String nome);
	
	List<Cliente> findByTelefone(String modelo);

}
