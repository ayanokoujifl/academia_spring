package com.academia.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.escola.entities.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
