/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.anime;

import net.sandrohc.jikan.Jikan;
import net.sandrohc.jikan.model.common.*;
import net.sandrohc.jikan.query.Query;

public class AnimeMoreInfoQuery extends Query<MoreInfo> {

	/** The anime ID. */
	private final int id;

	public AnimeMoreInfoQuery(Jikan jikan, int id) {
		super(jikan);
		this.id = id;
	}

	@Override
	public String getUri() {
		return "/anime/" + id + "/moreinfo";
	}

	@Override
	public Class<MoreInfo> getRequestClass() {
		return MoreInfo.class;
	}

}
