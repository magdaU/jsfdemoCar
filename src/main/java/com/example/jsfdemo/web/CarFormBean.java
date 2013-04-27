package com.example.jsfdemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.*;
import com.example.jsfdemo.service.*;

@SessionScoped
@Named("carBean")
public class CarFormBean implements Serializable{
	
	private Car car = new Car();

	private static final long serialVersionUID = 1L;
	
	@Inject
	CarManager carManager;
	
	public String addCar()
	{
		carManager.AddCar(car);
		car = new Car();
		return "showPersons";
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
