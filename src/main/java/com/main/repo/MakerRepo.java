package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Maker;

@Repository
public interface MakerRepo extends JpaRepository<Maker, Integer> {
	
	Maker findMakerByName(String name);

}
