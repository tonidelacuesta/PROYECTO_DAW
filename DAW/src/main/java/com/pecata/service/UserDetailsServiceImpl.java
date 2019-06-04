package com.pecata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pecata.modelo.RolesUsuariosVO;
import com.pecata.modelo.UsuarioVO;
import com.pecata.repository.UserRepository;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UserRepository ur;
 


	@Override
	 public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	       UsuarioVO u = ur.findUserAccount(userName);
	       
	       if (u == null) {
	           System.out.println("Usuario no encontrado " + userName);
	           throw new UsernameNotFoundException("Usuario " + userName + " no existe en la base de datos");
	       }

	       System.out.println("Usuario encontrado: " + u);

	       // [ROLE_USER, ROLE_ADMIN,..]
	 

	       List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
	       if (u.getRoles() != null) {
	           for (RolesUsuariosVO role : u.getRoles()) {
	               // ROLE_USER, ROLE_ADMIN,..
	               GrantedAuthority authority = new SimpleGrantedAuthority(role.getRol().getRoleName());
	               grantList.add(authority);
	           }
	       }

	       UserDetails userDetails = (UserDetails) new User(u.getUserName(), //
	               u.getEncrytedPassword(), grantList);

	       return userDetails;
	   }
 
  
 
}