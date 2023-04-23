package br.com.taking.DashboarMCIO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.taking.DashboarMCIO.model.Alunas;

/**
 * Não tem banco definido, mas aqui está tentando criar um repositório que
 * precisa de banco de dados.
 * 
 * Ai vai dar ruim, por falta de driver.
 * 
 * @author Aline Andrade
 *
 */
public interface AlunasRepository extends JpaRepository<Alunas, Integer> {

	Alunas findByCpf(String cpf);

}
