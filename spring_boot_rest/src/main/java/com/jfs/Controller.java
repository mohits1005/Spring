package com.jfs;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
	private static ArrayList<Car> rep = new ArrayList<>();

    public Controller() {
//        this.rep = rep;
        ArrayList<Car> rep = new ArrayList<>();
		rep.add(new Car("Ferrari"));
		rep.add(new Car("Jaguar"));
		rep.add(new Car("Aston Martin"));
//		for(int i=0;i<rep.size();i++)
//		{
//			System.out.println(rep.get(i));
//		}
		this.rep = rep;
    }
    
    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public ArrayList<Car> coolCars() {
        return rep;
    }
}
