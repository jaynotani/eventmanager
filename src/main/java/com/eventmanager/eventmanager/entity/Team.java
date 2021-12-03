package com.eventmanager.eventmanager.entity;

import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Team {
	private String name;
	private UUID teamId;
	private String contact;

	public Team(String name, UUID teamId, String contact) {
		super();
		this.name = name;
		this.teamId = teamId;
		this.contact = contact;
	}
}
