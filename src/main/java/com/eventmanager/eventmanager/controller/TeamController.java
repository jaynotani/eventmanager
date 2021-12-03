package com.eventmanager.eventmanager.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventmanager.eventmanager.entity.Team;

@RestController
public class TeamController {
	
	@GetMapping("/hello")
	public String sayHello(){
		return "Jai Shree Ram";
	}
	
	@GetMapping("/teamList")
	public List<Team> getTeamList(){
		List<Team> teamList = new ArrayList<Team>();
		Team team1 = new Team("Team 1", UUID.randomUUID(), "9403700724");
		Team team2 = new Team("Team 2", UUID.randomUUID(), "9890161141");
		teamList.add(team1);
		teamList.add(team2);
		return teamList;
	}
}
