package com.masai.entity;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.apache.catalina.users.AbstractUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="email")
public class Admin extends AbstractUser{
	@Id
	private Integer adminId;

	@Override
	public UserDatabase getUserDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInGroup(Group group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeGroups() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRoles() {
		// TODO Auto-generated method stub
		
	}
}
