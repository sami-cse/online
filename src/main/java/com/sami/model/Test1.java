package com.sami.model;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Test1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "test1Id")
	private int id;

	@Column(name = "test1Name")
	private String name;

	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "test1", cascade = CascadeType.ALL)
	private List<Test2> test2;

}
