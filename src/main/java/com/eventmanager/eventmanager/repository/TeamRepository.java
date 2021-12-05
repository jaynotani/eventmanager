package com.eventmanager.eventmanager.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.eventmanager.eventmanager.entity.Team;

@Repository
public interface TeamRepository extends CassandraRepository<Team, UUID>{
	
}
