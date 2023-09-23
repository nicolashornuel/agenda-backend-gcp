package com.nho.model;

import java.util.Objects;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;

@Document(collectionName = "calendarEvent")
public class CalendarEventEntity {

	@DocumentId
	private String id;
	private String title;
	private CalendarEventMeta meta;

	public CalendarEventEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CalendarEventMeta getMeta() {
		return meta;
	}

	public void setMeta(CalendarEventMeta meta) {
		this.meta = meta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, meta, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CalendarEventEntity other = (CalendarEventEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(meta, other.meta)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "CalendarEventEntity [id=" + id + ", title=" + title + ", meta=" + meta + "]";
	}

}
