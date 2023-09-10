package com.selva.search;

import java.util.Date;
import java.util.List;

import com.selva.entity.Show;

public interface SearchService {

	public List<Show> findShows(Integer movieId, Date showDate);

}
