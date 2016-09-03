package com.shortcutio.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Software {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long ref;
	String name;
	@OneToMany(fetch=FetchType.LAZY)
	private Collection<Shortcut> shortcuts;
	
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Software(String name) {
		super();
		this.name = name;
	}
	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
