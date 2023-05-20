package com.pporzuczek.web.rooms.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Organization {
    @GeneratedValue
    @Id
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Name must have at least 3 characters.")
    private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
