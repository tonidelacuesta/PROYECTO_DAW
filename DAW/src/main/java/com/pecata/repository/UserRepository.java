package com.pecata.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pecata.modelo.UsuarioVO;

@Repository
@Transactional
public class UserRepository {

   @Autowired
   private EntityManager entityManager;
   
   
   public UsuarioVO findUserAccount(String userName) {
       try {
         

           Query query = entityManager.createQuery("select u from UsuarioVO u where u.userName=:nombre", UsuarioVO.class);
           query.setParameter("nombre", userName);

           return (UsuarioVO) query.getSingleResult();
       } catch (NoResultException e) {
           return null;
       }
   }
   
  
}