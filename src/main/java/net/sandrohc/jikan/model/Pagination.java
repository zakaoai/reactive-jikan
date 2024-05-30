/*
 * Copyright © 2022, Sandro Marques and the reactive-jikan contributors
 *
 * @author Sandro Marques <sandro123iv@gmail.com>
 */

package net.sandrohc.jikan.model;

import java.io.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.sandrohc.jikan.utils.Generated;

public class Pagination implements Serializable {

	@JsonProperty("last_visible_page")
	public int lastVisiblePage;

	@JsonProperty("current_page")
	public int currentPage;

	@JsonProperty("has_next_page")
	public boolean hasNextPage;

	public int getLastVisiblePage() {
		return lastVisiblePage;
	}

	public void setLastVisiblePage(int lastVisiblePage) {
		this.lastVisiblePage = lastVisiblePage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pagination that = (Pagination) o;

		if (lastVisiblePage != that.lastVisiblePage) return false;
		if (currentPage != that.currentPage) return false;
        return hasNextPage == that.hasNextPage;
    }

	@Override
	public int hashCode() {
		int result = lastVisiblePage;
		result = 31 * result + currentPage;
		result = 31 * result + (hasNextPage ? 1 : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Pagination{" +
				"lastVisiblePage=" + lastVisiblePage +
				", currentPage=" + currentPage +
				", hasNextPage=" + hasNextPage +
				'}';
	}
}
