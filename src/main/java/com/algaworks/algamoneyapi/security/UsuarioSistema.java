/**
 * 
 */
package com.algaworks.algamoneyapi.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.algaworks.algamoneyapi.model.Usuario;

/**
 * @author Usuario
 *
 */
public class UsuarioSistema extends User{

	private Usuario usuario;
	
	private static final long serialVersionUID = 1L;
	
	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getEmail(), usuario.getSenha(),authorities);
		this.usuario = usuario;		
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
