package com.selva.search;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selva.entity.Show;
import com.selva.exceptions.RecordNotFoundException;

@RestController
@RequestMapping("/search")

public class SearchController {
	protected Logger logger = Logger.getLogger(SearchController.class.getName());

	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {

		this.searchService = searchService;

	}

	@GetMapping("/checkhealth")
	public String checkHealth() {

		return "Search Service is healthy!!";
	}

	@RequestMapping("/theater/{movieId}")
	public List<Show> findShows(@PathVariable("movieId") Integer movieId) {

		logger.info("search-service findShows() invoked: ");
		Date date = new Date();
		List<Show> listShows = searchService.findShows(movieId, date);
		logger.info("# of Shows found for the movie and date: " + listShows.size());

		if (listShows == null || listShows.size() == 0)
			throw new RecordNotFoundException(movieId + " - " + date);
		else {
			return listShows;
		}
	}

}
