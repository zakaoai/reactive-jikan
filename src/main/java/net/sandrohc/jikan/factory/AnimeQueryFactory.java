/*
 * Copyright © 2022, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.factory;

import net.sandrohc.jikan.Jikan;
import net.sandrohc.jikan.exception.JikanInvalidArgumentException;
import net.sandrohc.jikan.model.enums.*;
import net.sandrohc.jikan.query.anime.*;

/**
 * Factory for the anime queries.
 *
 * @see <a href="https://docs.api.jikan.moe/#tag/anime">Jikan API docs - anime</a>
 */
public class AnimeQueryFactory extends Factory {

	public AnimeQueryFactory(Jikan jikan) {
		super(jikan);
	}

	/**
	 * Get the anime details.
	 *
	 * @param animeId The anime ID
	 * @return The anime query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeById">Jikan API docs - getAnimeById</a>
	 */
	public AnimeQuery get(int animeId) {
		return new AnimeQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime search.
	 *
	 * @return The anime search query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeSearch">Jikan API docs - getAnimeSearch</a>
	 */
	public AnimeSearchQuery search() {
		return new AnimeSearchQuery(this.jikan);
	}

	// TODO: implement
//	public AnimeTopQueryV4 top(int page) throws JikanInvalidArgumentException {
//		return new AnimeTopQuery(this.jikan, page);
//	}
//
//	public AnimeGenreQueryV4 genre(AnimeGenre genre, int page) throws JikanInvalidArgumentException {
//		return new AnimeGenreQuery(this.jikan, genre, page);
//	}

	/**
	 * Get the list of characters.
	 *
	 * @param animeId The anime ID
	 * @return The anime characters query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeCharacters">Jikan API docs - getAnimeCharacters</a>
	 */
	public AnimeCharactersQuery characters(int animeId) {
		return new AnimeCharactersQuery(this.jikan, animeId);
	}

	/**
	 * Get the list of staff.
	 *
	 * @param animeId The anime id
	 * @return The anime staff query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeStaff">Jikan API docs - getAnimeStaff</a>
	 */
	public AnimeStaffQuery staff(int animeId) {
		return new AnimeStaffQuery(this.jikan, animeId);
	}

	/**
	 * Get the list of episodes.
	 *
	 * @param animeId The anime ID
	 * @return The anime episodes query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeEpisodes">Jikan API docs - getAnimeEpisodes</a>
	 */
	public AnimeEpisodesQuery episodes(int animeId) throws JikanInvalidArgumentException {
		return new AnimeEpisodesQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime episode details.
	 *
	 * @param animeId The anime ID
	 * @param episode The episode number, starting at 1
	 * @return The anime episode query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeEpisodeById">Jikan API docs - getAnimeEpisodeById</a>
	 */
	public AnimeEpisodeQuery episode(int animeId, int episode) throws JikanInvalidArgumentException {
		return new AnimeEpisodeQuery(this.jikan, animeId, episode);
	}

	/**
	 * Get the anime news.
	 *
	 * @param animeId The anime ID
	 * @param page The page number
	 * @return The anime news query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeNews">Jikan API docs - getAnimeNews</a>
	 */
	public AnimeNewsQuery news(int animeId, int page) throws JikanInvalidArgumentException {
		return new AnimeNewsQuery(this.jikan, animeId, page);
	}

	/**
	 * Get the anime forum posts.
	 *
	 * @param animeId        The anime ID
	 * @param forumTopicType The forum topic type
	 * @return The anime forum query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeForum">Jikan API docs - getAnimeForum</a>
	 */
	public AnimeForumQuery forum(int animeId, ForumTopicType forumTopicType) {
		return new AnimeForumQuery(this.jikan, animeId, forumTopicType);
	}

	/**
	 * Get the anime videos.
	 *
	 * @param animeId The anime ID
	 * @return The anime videos query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeVideos">Jikan API docs - getAnimeVideos</a>
	 */
	public AnimeVideosQuery videos(int animeId) {
		return new AnimeVideosQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime pictures.
	 *
	 * @param animeId The anime ID
	 * @return The anime pictures query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimePictures">Jikan API docs - getAnimePictures</a>
	 */
	public AnimePicturesQuery pictures(int animeId) {
		return new AnimePicturesQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime statistics.
	 *
	 * @param animeId The anime ID
	 * @return The anime statistics query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeStatistics">Jikan API docs - getAnimeStatistics</a>
	 */
	public AnimeStatisticsQuery statistics(int animeId) {
		return new AnimeStatisticsQuery(this.jikan, animeId);
	}

	/**
	 * Get the "more info" section.
	 *
	 * @param animeId The anime ID
	 * @return The anime more info query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeMoreInfo">Jikan API docs - getAnimeMoreInfo</a>
	 */
	public AnimeMoreInfoQuery moreInfo(int animeId) {
		return new AnimeMoreInfoQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime recommendations.
	 *
	 * @param animeId The anime ID
	 * @return The anime recommendations query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeRecommendations">Jikan API docs - getAnimeRecommendations</a>
	 */
	public AnimeRecommendationsQuery recommendations(int animeId) {
		return new AnimeRecommendationsQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime user updates.
	 *
	 * @param animeId The anime ID
	 * @param page    The page
	 * @return The anime user updates query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeUserUpdates">Jikan API docs - getAnimeUserUpdates</a>
	 */
	public AnimeUserUpdatesQuery userUpdates(int animeId, int page) throws JikanInvalidArgumentException {
		return new AnimeUserUpdatesQuery(this.jikan, animeId, page);
	}

	/**
	 * Get the anime reviews.
	 *
	 * @param animeId The anime ID
	 * @param page    The page
	 * @return The anime reviews query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeReviews">Jikan API docs - getAnimeReviews</a>
	 */
	public AnimeReviewsQuery reviews(int animeId, int page) throws JikanInvalidArgumentException {
		return new AnimeReviewsQuery(this.jikan, animeId, page);
	}

	/**
	 * Get the anime relations.
	 *
	 * @param animeId The anime ID
	 * @return The anime relations query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeRelations">Jikan API docs - getAnimeRelations</a>
	 */
	public AnimeRelationsQuery relations(int animeId) {
		return new AnimeRelationsQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime theme songs.
	 *
	 * @param animeId The anime ID
	 * @return The anime themes query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeThemes">Jikan API docs - getAnimeThemes</a>
	 */
	public AnimeThemesQuery themes(int animeId) {
		return new AnimeThemesQuery(this.jikan, animeId);
	}

	/**
	 * Get the anime external links.
	 *
	 * @param animeId The anime ID
	 * @return The anime external query
	 * @see <a href="https://docs.api.jikan.moe/#operation/getAnimeExternal">Jikan API docs - getAnimeExternal</a>
	 */
	public AnimeExternalQuery external(int animeId) {
		return new AnimeExternalQuery(this.jikan, animeId);
	}

}
