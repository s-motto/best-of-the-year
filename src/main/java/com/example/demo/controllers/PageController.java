package com.example.demo.controllers;




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Movie;
import com.example.demo.model.Song;


@Controller
@RequestMapping("/")
public class PageController {

	 @GetMapping("/")
	    public String bestOf( Model model) {
	    	model.addAttribute("name", "Brina");
	    	
	    	return "best";
	    }
	 
	 
	 @GetMapping("/movies-titles")
	    public String movieTitles( Model model) {
	    	model.addAttribute("title", "List of the best movies");
	    	String bestMovies="";
	    	for(Movie movies: getBestMovies()) {
	    		bestMovies += movies.getTitle() + "--";
	    	}
	    	
	    	model.addAttribute("list", bestMovies);
	    	
	    	return "titles";
	    }
	 
	 
	 @GetMapping("/songs-titles")
	    public String songsTitles( Model model) {
	    	model.addAttribute("title", "List of the best songs");
	    	String bestSongs="";
	    	for(Song songs: getBestSong()) {
	    		bestSongs += songs.getTitle() + "--";
	    	}
	    	
	    	model.addAttribute("list", bestSongs);
	    	return "titles";
	    }
	 
	 private List<Movie> getBestMovies(){
		 List<Movie> movies=new ArrayList<Movie>();
		 movies.add(new Movie(0,"Il castello errante di Howl"));
		 movies.add(new Movie(1,"Porco Rosso"));
		 movies.add(new Movie(2,"Il mio vicino Totoro"));
		 movies.add(new Movie(3,"Ponyo"));
		 movies.add(new Movie(4,"Nausicaa nella valle del vento"));
		 movies.add(new Movie(5,"Il castello nel cielo"));
		 movies.add(new Movie(6,"La città incantata"));
		 movies.add(new Movie(7,"Il ragazzo e l'airone"));
		 return movies;
	 }
	 
	 private List<Song> getBestSong(){
		 List<Song> songs=new ArrayList<Song>();
		 songs.add(new Song(0,"Freak on a leash"));
		 songs.add(new Song(1,"Pink Pony Club"));
		 songs.add(new Song(2,"Toxicity"));
		 songs.add(new Song(3,"Curami"));
		 songs.add(new Song(4,"Benzin"));
		 songs.add(new Song(5,"Master of Puppets"));
		 songs.add(new Song(6,"Magister Barbero"));
		 songs.add(new Song(7,"Wait and Bleed"));
		 return songs;
	 }
	 
	 
}
