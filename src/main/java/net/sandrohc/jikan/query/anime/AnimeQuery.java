/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.anime;

import com.fasterxml.jackson.core.type.TypeReference;
import net.sandrohc.jikan.Jikan;
import net.sandrohc.jikan.model.*;
import net.sandrohc.jikan.model.anime.*;
import net.sandrohc.jikan.query.Query;
import net.sandrohc.jikan.query.QueryUrl;
import reactor.core.publisher.Mono;

import static net.sandrohc.jikan.query.QueryUrl.endpoint;

/**
 * Query for the anime details.
 *
 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeById">Jikan API docs - getAnimeById</a>
 */
public class AnimeQuery extends Query<DataHolder<Anime>, Mono<Anime>> {

	/** The anime ID. */
	protected final int id;

	public AnimeQuery(Jikan jikan, int id) {
		super(jikan);
		this.id = id;
	}

	@Override
	public QueryUrl getUrl() {
		return endpoint("/anime/" + id);
	}

	@Override
	public TypeReference<DataHolder<Anime>> getResponseType() {
		return new TypeReference<DataHolder<Anime>>() { };
	}

	@Override
	public Mono<Anime> process(Mono<DataHolder<Anime>> content) {
		return content.map(holder -> holder.data);
	}
}
