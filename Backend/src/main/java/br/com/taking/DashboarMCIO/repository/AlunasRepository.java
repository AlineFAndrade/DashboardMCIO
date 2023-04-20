package br.com.taking.DashboarMCIO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.taking.DashboarMCIO.model.Alunas;

public interface AlunasRepository extends JpaRepository<Alunas, Integer>{

		Alunas findByCpf(String cpf);
		
	}



