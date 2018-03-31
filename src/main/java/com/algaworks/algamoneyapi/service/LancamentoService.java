/**
 * 
 */
package com.algaworks.algamoneyapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.algaworks.algamoneyapi.exceptionhandler.AlgamoneyExceptionHandler.Erro;
import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.repository.LancamentoRepository;
import com.algaworks.algamoneyapi.repository.PessoaRepository;
import com.algaworks.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

/**
 * @author Usuario
 *
 */
@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null  || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}		
		return lancamentoRepository.save(lancamento);
	}
	
	public Lancamento deletar(Long codigo) {
		
		Lancamento lancamento = lancamentoRepository.findOne(codigo);		
		lancamentoRepository.delete(codigo);		
		return lancamento;		
	}
	
	
	
}
