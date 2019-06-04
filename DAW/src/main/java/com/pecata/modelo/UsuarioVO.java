package com.pecata.modelo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "usuarios", //
       uniqueConstraints = { //
               @UniqueConstraint(name = "USUARIOS_UK", columnNames = "User_Name") })
public class UsuarioVO {

   @Id
   @GeneratedValue
   @Column(name = "User_Id", nullable = false)
   private Long userId;

   @Column(name = "User_Name", length = 36, nullable = false)
   private String userName;

   @Column(name = "Encryted_Password", length = 128, nullable = false)
   private String encrytedPassword;

   @Column(name = "Enabled", length = 1, nullable = false)
   private boolean enabled;
   
   @OneToMany(mappedBy="usuario",fetch=FetchType.EAGER,cascade= {CascadeType.ALL}, orphanRemoval = true)
   @Fetch(value = FetchMode.SUBSELECT)
   private List<RolesUsuariosVO> roles;

   public Long getUserId() {
       return userId;
   }

   public void setUserId(Long userId) {
       this.userId = userId;
   }

   public String getUserName() {
       return userName;
   }

   public void setUserName(String userName) {
       this.userName = userName;
   }

   public String getEncrytedPassword() {
       return encrytedPassword;
   }

   public void setEncrytedPassword(String encrytedPassword) {
       this.encrytedPassword = encrytedPassword;
   }

   public boolean isEnabled() {
       return enabled;
   }

   public void setEnabled(boolean enabled) {
       this.enabled = enabled;
   }

public List<RolesUsuariosVO> getRoles() {
	return roles;
}

public void setRoles(List<RolesUsuariosVO> roles) {
	this.roles = roles;
}

}