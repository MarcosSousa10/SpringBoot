package com.WebServer.Atividade3.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.WebServer.Atividade3.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
