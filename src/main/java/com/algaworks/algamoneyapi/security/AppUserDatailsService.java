/**
 * 
 */
package com.algaworks.algamoneyapi.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.algaworks.algamoneyapi.model.Usuario;
import com.algaworks.algamoneyapi.repository.UsuarioRepository;


/**
 * @author Usuario
 *
 */
@Service
public class AppUserDatailsService  implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(email);
		Usuario usuario=usuarioOptional.orElseThrow(() -> new UsernameNotFoundException("Usuario e/ou Senha incorretos!"));
		return new UsuarioSistema(usuario , getPermissoes(usuario));
		
	}

	private Collection<? extends GrantedAuthority> getPermissoes(Usuario usuario) {
	
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		usuario.getPermissoes().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescricao().toUpperCase())));
		return authorities;

	}	
}
