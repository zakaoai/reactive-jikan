/*
 * Copyright © 2022, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.model;

import net.sandrohc.jikan.model.anime.*;
import net.sandrohc.jikan.model.enums.*;
import net.sandrohc.jikan.model.manga.*;
import net.sandrohc.jikan.utils.Generated;

/**
 * The base object for anime/manga genre with a type, name and URL.
 *
 * @param <T> the type of genre, either {@linkplain AnimeGenre} or {@linkplain MangaGenre}
 */
public class GenreEntity<T> extends MalEntity {

	/** The genre type. */
	public Type type;

	/** The genre name. */
	public T name;

	/** The URL to the genre page on MyAnimeList. */
	public String url;


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Generated
	@Override
	public String toString() {
		return "Genre[id=" + malId + ", genre=" + name + ']';
	}
}
