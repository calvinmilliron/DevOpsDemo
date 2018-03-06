package com.revature.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.domain.Genre;

@Controller
public class GenreController {

	@GetMapping("/allgenres")
	@ResponseBody
	public ResponseEntity<ArrayList<Genre>> getAllGenres() {
		ArrayList<Genre> genres = new ArrayList<>();
		genres.add(new Genre("action"));
		genres.add(new Genre("comedy"));
		genres.add(new Genre("drama"));
		return new ResponseEntity<>(genres, HttpStatus.OK);
	}
}
