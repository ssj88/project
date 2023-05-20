package com.pporzuczek.web.rooms.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String description; 
	private String speaker;
	
	@Column(name="start")
	private Date start;
	
	@Column(name="stop")
	private Date end;
	
    @NotNull
    @ManyToOne
    private Room room;
   
    @NotNull
    @ManyToOne
    private Account account;
	
	public Event(String title, String description, String speaker, Date start, Date end, Room room, Account account) {
		super();
		this.title = title;
		this.description = description;
		this.speaker = speaker;
		this.start = start;
		this.end = end;
		this.room = room;
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", description="
				+ description + ", speaker=" + speaker + ", start=" + start
				+ ", stop=" + end + ", room=" + room + ", account=" + account + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}