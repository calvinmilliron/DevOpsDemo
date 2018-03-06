package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.revature.domain.Genre;

@WebService(endpointInterface="com.revature.service.Catalog")
public class CatalogImpl implements Catalog {

	@Override
	public List<Genre> getAllGenres() {
		List<Genre> genreList = new ArrayList<>();
		genreList.add(new Genre("Comedy"));
		genreList.add(new Genre("Action"));
		genreList.add(new Genre("Drama"));
		
		return genreList;
	}

	@Override
	public String addBook(Genre genre)  {
		// Not real database
		return "Added " + genre.getName();
	}

}
