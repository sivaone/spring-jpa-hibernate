package me.sivanagireddy.cars.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.sivanagireddy.cars.model.Car;
import me.sivanagireddy.cars.service.CarServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
	@Autowired
	private CarServiceImpl carService;
	
	@RequestMapping("/getCarInfo")
	public String getCarInfo(HttpServletRequest req, HttpServletResponse resp, Model model){
		
		Integer id = new Integer(req.getParameter("carId"));
		System.out.println("id is -->"+id);
		Car carInfo = carService.getCarById(id);
		model.addAttribute("carInfo", carInfo);
		return "carinfo";
	}
	
}
