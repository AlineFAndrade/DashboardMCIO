package br.com.taking.DashboarMCIO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.taking.DashboarMCIO.model.Associadas;

public interface AssociadasRepository extends JpaRepository<Associadas, Integer> {

	Associadas findByCpf(String cpf);

}
