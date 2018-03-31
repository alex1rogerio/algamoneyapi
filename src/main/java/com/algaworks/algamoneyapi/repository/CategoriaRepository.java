/**
 * 
 */
package com.algaworks.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algamoneyapi.model.Categoria;

/**
 * @author Usuario
 *
 */

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{	
	
}
