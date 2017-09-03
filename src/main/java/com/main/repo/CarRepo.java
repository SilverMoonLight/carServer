package com.main.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
	
	
	
}
