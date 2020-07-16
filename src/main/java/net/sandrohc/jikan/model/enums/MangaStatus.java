/*
 * Copyright © 2020, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.model.enums;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MangaStatus {
	@JsonProperty("Publishing")
	PUBLISHING,

	@JsonProperty("Completed")
	@JsonAlias({ "Complete", "Finished" })
	COMPLETED,

	@JsonProperty("To be published")
	@JsonAlias({ "TBP", "Upcoming" })
	TO_BE_PUBLISHED,
}
