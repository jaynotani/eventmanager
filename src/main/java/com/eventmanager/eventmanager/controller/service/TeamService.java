package com.eventmanager.eventmanager.controller.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanager.eventmanager.entity.Team;
import com.eventmanager.eventmanager.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	public Team getTeamById(UUID id) {
		return teamRepository.findById(id).get();
	}
	
	public Team addTeam(Team team) {
		return teamRepository.save(team);
	}
}
