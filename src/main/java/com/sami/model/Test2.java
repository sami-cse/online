package com.sami.model;

import javax.persistence.*;

@Entity
public class Test2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "test2")
	private int id;
	
	@Column(name = "test2Name")
	private String name;
	
	
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="test1Id", referencedColumnName="test1Id")
	private Test1 test1;
	
}



