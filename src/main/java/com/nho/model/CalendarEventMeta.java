package com.nho.model;

import java.util.Objects;

import com.google.cloud.Timestamp;

public class CalendarEventMeta {

	private CalendarEventType type;
	private Timestamp start;
	private Timestamp end;

	public CalendarEventMeta() {
	}

	public CalendarEventType getType() {
		return type;
	}

	public void setType(CalendarEventType type) {
		this.type = type;
	}

	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	@Override
	public int hashCode() {
		return Objects.hash(end, start, type);
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
		CalendarEventMeta other = (CalendarEventMeta) obj;
		return Objects.equals(end, other.end) && Objects.equals(start, other.start)
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "CalendarEventMeta [type=" + type + ", start=" + start + ", end=" + end + "]";
	}

}
