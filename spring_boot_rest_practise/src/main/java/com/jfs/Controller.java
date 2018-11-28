package com.jfs;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
	private static ArrayList<Note> rep = new ArrayList<>();

    public Controller() {
        ArrayList<Note> rep = new ArrayList<>();
		rep.add(new Note("Go Fishing"));
		rep.add(new Note("Revise Lecture"));
		rep.add(new Note("Eat Dinner"));
		this.rep = rep;
    }
    
    @GetMapping("/notes")
    @CrossOrigin(origins = "http://localhost:4200")
    public ArrayList<Note> fetchNotes() {
        return rep;
    }
}
