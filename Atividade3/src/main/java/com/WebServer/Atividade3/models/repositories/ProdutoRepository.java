package com.WebServer.Atividade3.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.WebServer.Atividade3.models.entities.Produto;

//public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findBynomeContainingIgnoreCase(String parteNome);
	
	
//	findBynomeContaining
//	findBynomeIsContaining
//	findBynomeContains
//	
//	findBynomeStartsWith
//	findBynomeEndWith
//	
//	findBynomeNotContaining
	//exemplo com select cont linha42
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
