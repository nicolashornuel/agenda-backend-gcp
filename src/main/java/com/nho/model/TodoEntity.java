package com.nho.model;

import java.util.Objects;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;

@Document(collectionName = "todoList")
public class TodoEntity {

	@DocumentId
	private String DocumentId;
	private String id;
	private boolean isResolved;
	private String description;
	private int priority;
	private Timestamp creatingDate;
	private Timestamp updatingDate;
	private String category;

	public TodoEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Timestamp getCreatingDate() {
		return creatingDate;
	}

	public void setCreatingDate(Timestamp creatingDate) {
		this.creatingDate = creatingDate;
	}

	public Timestamp getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Timestamp updatingDate) {
		this.updatingDate = updatingDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, creatingDate, description, id, isResolved, priority,
				updatingDate);
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
		TodoEntity other = (TodoEntity) obj;
		return Objects.equals(category, other.category)
				&& Objects.equals(creatingDate, other.creatingDate)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& isResolved == other.isResolved && priority == other.priority
				&& Objects.equals(updatingDate, other.updatingDate);
	}

	@Override
	public String toString() {
		return "TodoEntity [id=" + id + ", isResolved=" + isResolved + ", description="
				+ description + ", priority=" + priority + ", creatingDate=" + creatingDate
				+ ", updatingDate=" + updatingDate + ", category=" + category + "]";
	}

}