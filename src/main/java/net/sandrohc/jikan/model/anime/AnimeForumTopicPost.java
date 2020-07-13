/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.model.anime;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimeForumTopicPost {

	public String url;

	@JsonProperty("author_name")
	public String authorName;

	@JsonProperty("author_url")
	public String authorUrl;

	@JsonProperty("date_posted")
	public OffsetDateTime datePosted;


	@Override
	public String toString() {
		return "AnimeForumTopicPost[" +
			   "url='" + url + '\'' +
			   ", authorName='" + authorName + '\'' +
			   ", datePosted=" + datePosted +
			   ']';
	}

}
