package com.tsungie.ncube.tsungielostandfoundsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class LostAndFoundRepository {
	
	public interface LostAndFound extends JpaRepository<LostAndFound, Long> {
		
		  List<LostAndFound> findByProvince(String title);
		}
}
