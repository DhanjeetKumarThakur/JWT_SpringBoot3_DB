package com.learningJWT.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter   //This is annotation is of lombok it will generate Getters method    
@Setter   //This is annotation is of lombok it will generate Setters method
@NoArgsConstructor //This is annotation is of lombok it will generate No-Argument Constructor (Default Constructor)
@AllArgsConstructor //This is annotation is of lombok it will generate Parameterize Constructor
@ToString //This is annotation is of lombok it will generate toString method
@Entity
@Table(name="user_table")
public class User implements UserDetails{

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Id
	private String userId;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String about;
	
}
