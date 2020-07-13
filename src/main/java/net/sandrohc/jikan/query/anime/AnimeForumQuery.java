/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.anime;

import net.sandrohc.jikan.model.anime.AnimeForum;
import net.sandrohc.jikan.query.Query;

public class AnimeForumQuery extends Query<AnimeForum> {

	private final int id;


	public AnimeForumQuery(int id) {
		this.id = id;
	}

	@Override
	public String getBaseUri() {
		return "anime/" + id + "/forum";
	}

	@Override
	public Class<AnimeForum> getRequestClass() {
		return AnimeForum.class;
	}

}
