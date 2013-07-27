package me.sivanagireddy.cars.service;

import me.sivanagireddy.cars.model.Car;
import me.sivanagireddy.cars.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl {
	@Autowired
	private CarRepository carRepository;
	
	public Car getCarById(Integer Id){
		return carRepository.getCarById(Id);
	}
}
