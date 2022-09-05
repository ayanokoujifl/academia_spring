package com.academia.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.escola.entities.Venda;
@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
