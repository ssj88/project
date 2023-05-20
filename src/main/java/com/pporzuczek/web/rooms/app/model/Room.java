package com.pporzuczek.web.rooms.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Room {
    @GeneratedValue
    @Id
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Name must have at least 3 characters.")
    private String name;
    
    private int positions = 0;
    
    private int computers = 0;
    
    private String network = "NO";
    
    private String projector = "NO";
    
    private String speakers = "NO";
    
    private String conditioning = "NO";
    
    private String board = "NO";
       
    @ManyToOne
    @NotNull
    private Unit unit;

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

	public int getPositions() {
		return positions;
	}

	public void setPositions(int positions) {
		this.positions = positions;
	}

	public int getComputers() {
		return computers;
	}

	public void setComputers(int computers) {
		this.computers = computers;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getProjector() {
		return projector;
	}

	public void setProjector(String projector) {
		this.projector = projector;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public String getConditioning() {
		return conditioning;
	}

	public void setConditioning(String conditioning) {
		this.conditioning = conditioning;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Room(Long id, String name, int positions, int computers, String network, String projector, String speakers,
			String conditioning, String board, Unit unit) {
		super();
		this.id = id;
		this.name = name;
		this.positions = positions;
		this.computers = computers;
		this.network = network;
		this.projector = projector;
		this.speakers = speakers;
		this.conditioning = conditioning;
		this.board = board;
		this.unit = unit;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}