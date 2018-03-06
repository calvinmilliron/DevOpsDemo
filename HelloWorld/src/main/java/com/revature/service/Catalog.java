package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.domain.Genre;

// Uses JAX-WS to generate WSDL from @WebService
// Can be seen at /library?wsdl
@WebService
public interface Catalog {

	public List<Genre> getAllGenres();
	public String addBook(Genre genre);
}
