package com.selva.theater.show;

import com.selva.entity.Show;

public interface ShowService {

	public Integer createShow(Show show);

	public Boolean updateShow(Show show);

	public Boolean deleteShow(Integer showId);
}
