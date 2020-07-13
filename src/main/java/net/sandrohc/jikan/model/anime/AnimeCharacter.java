package net.sandrohc.jikan.model.anime;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.sandrohc.jikan.model.base.MalEntity;

public class AnimeCharacter extends MalEntity {

	public String url;

	@JsonProperty("image_url")
	public String imageUrl;

	public String name;

	public String role; // TODO: convert to enum

	@JsonProperty("voice_actors")
	public List<AnimeCharacterVoiceActor> voiceActors;


	@Override
	public String toString() {
		return "AnimeCharacter[" +
			   "id=" + malId +
			   ", name='" + name + '\'' +
			   ']';
	}
}