/*
 * Copyright © 2022, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.query.person;

import java.time.*;

import net.sandrohc.jikan.exception.JikanQueryException;
import net.sandrohc.jikan.exception.JikanUrlException;
import net.sandrohc.jikan.model.person.*;
import net.sandrohc.jikan.test.RequestTest;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.*;

import static net.sandrohc.jikan.test.MockUtils.MOCK_URL;
import static net.sandrohc.jikan.test.MockUtils.mock;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonQueryTest extends RequestTest {

	@Test
	void fetchPersonDetails() throws JikanQueryException, JikanUrlException {
		/* Arrange */
		mock(mockServer, "/people/1", 1, "people/getPersonById.json");

		/* Act */
		PersonQuery query = jikan.query().person().get(1);
		Person person = query.execute().block();

		/* Assert */
		SoftAssertions softly;

		// Query
		assertThat(query.toString()).isNotNull();
		assertThat(query.getUrl().build().toString()).isEqualTo(MOCK_URL + "/people/1");

		// Person
		assertThat(person).isNotNull();
		softly = new SoftAssertions();
		softly.assertThat(person.toString()).isNotNull();
		softly.assertThat(person.malId).isEqualTo(11817);
		softly.assertThat(person.url).isEqualTo("URL");
		softly.assertThat(person.name).isEqualTo("Yoshitsugu Matsuoka");
		softly.assertThat(person.images.jpg.imageUrl).isEqualTo("IMG");
		softly.assertThat(person.websiteUrl).isEqualTo("WEBSITE");
		softly.assertThat(person.givenName).isEqualTo("GIVEN");
		softly.assertThat(person.familyName).isEqualTo("FAMILY");
		softly.assertThat(person.alternativeNames).containsExactly("NICK");
		softly.assertThat(person.birthday).isEqualTo(LocalDate.of(2020, Month.JANUARY, 1).atTime(0, 0).atOffset(ZoneOffset.UTC));
		softly.assertThat(person.favorites).isEqualTo(1);
		softly.assertThat(person.about).isEqualTo("ABOUT");
		softly.assertAll();
	}
}
