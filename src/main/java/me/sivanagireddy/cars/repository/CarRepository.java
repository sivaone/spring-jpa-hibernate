package me.sivanagireddy.cars.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import me.sivanagireddy.cars.model.Car;

import org.springframework.stereotype.Repository;


@Repository
public class CarRepository {
	@PersistenceContext
	private EntityManager em;
	
	public Car getCarById(Integer Id){
		
		return em.find(Car.class, Id);
		
	}
}
