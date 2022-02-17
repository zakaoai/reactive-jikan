/*
 * Copyright © 2022, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.manga;

import java.util.*;

import net.sandrohc.jikan.exception.JikanQueryException;
import net.sandrohc.jikan.exception.JikanUrlException;
import net.sandrohc.jikan.model.common.*;
import net.sandrohc.jikan.test.RequestTest;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.*;

import static net.sandrohc.jikan.test.MockUtils.MOCK_URL;
import static net.sandrohc.jikan.test.MockUtils.mock;
import static org.assertj.core.api.Assertions.assertThat;

public class MangaRelationsQueryTest extends RequestTest {

	@Test
	void fetchMangaRelations() throws JikanQueryException, JikanUrlException {
		/* Arrange */
		mock(mockServer, "/manga/23390/relations", 1, "manga/getAnimeById.json");

		/* Act */
		MangaRelationsQuery query = jikan.query().manga().relations(11757);
		Collection<Related> related = query.execute().collectList().block();

		/* Assert */
		SoftAssertions softly;

		// Query
		assertThat(query.toString()).isNotNull();
		assertThat(query.getUrl().build().toString()).isEqualTo(MOCK_URL + "/manga/23390/relations");

		// Relations
		assertThat(related).isNotNull();
		assertThat(related).hasSize(1);

		// TODO
	}
}