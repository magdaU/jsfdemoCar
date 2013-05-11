package com.example.jsfdemo.service;

import java.util.*;

import com.example.jsfdemo.domain.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CarManager {
	
	private List<Car> cars = new ArrayList<Car>();
	
	@Inject
	private PersonManager personManager;
	
	public Car get(int id)
	{
		for(Car c : cars)
			if(c.getId()==id)
				return c;
		return null;
	}
	
	public void AddCar(Car car)
	{
		car.setOwner(personManager.get(car.getOwnerId()));
		
		if(car.getOwner()==null)return;
		Person p = personManager.get(car.getOwner().getId());
		if(p!=null)
		{
			p.getCars().add(car);
		}
		Car c = get(car.getId());
		if(c==null)
			cars.add(car);
		else
		{
			c.setRegisterNumber(car.getRegisterNumber());
			c.setName(car.getName());
			c.setOwner(car.getOwner());
		}
	}
}
