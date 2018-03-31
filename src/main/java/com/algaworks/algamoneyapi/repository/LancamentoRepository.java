/**
 * 
 */
package com.algaworks.algamoneyapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.filter.LancamentoFilter;
import com.algaworks.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

/**
 * @author Usuario
 *
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> , LancamentoRepositoryQuery {

	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
