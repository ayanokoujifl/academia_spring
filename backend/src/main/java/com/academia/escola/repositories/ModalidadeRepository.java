package com.academia.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.escola.entities.Modalidade;
@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long>{

}
