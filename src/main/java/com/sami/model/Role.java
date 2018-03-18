package com.sami.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RoleId")
	private Integer roleId;
	
	@Column(name = "RoleName")
	private String roleName;

	@ManyToMany(mappedBy = "role")
	private Set<User> user;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

}
