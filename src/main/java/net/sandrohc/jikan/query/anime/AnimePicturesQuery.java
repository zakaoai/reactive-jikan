/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.anime;

import net.sandrohc.jikan.model.anime.AnimeNews;
import net.sandrohc.jikan.model.anime.AnimePictures;
import net.sandrohc.jikan.query.Query;

public class AnimePicturesQuery extends Query<AnimePictures> {

	private final int id;


	public AnimePicturesQuery(int id) {
		this.id = id;
	}

	@Override
	public String getBaseUri() {
		return "anime/" + id + "/pictures";
	}

	@Override
	public Class<AnimePictures> getRequestClass() {
		return AnimePictures.class;
	}

}
