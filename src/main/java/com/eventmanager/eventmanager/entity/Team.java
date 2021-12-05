package com.eventmanager.eventmanager.entity;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Table
public class Team {
	private String name;
	
	@PrimaryKey
	private UUID id;
	private String contact;
	private boolean isAvailable;

	public Team(String name, UUID id, String contact, boolean isAvailable) {
		super();
		this.name = name;
		this.id = id;
		this.contact = contact;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", id=" + id + ", contact=" + contact + ", isAvailale=" + isAvailable + "]";
	}
	
}
