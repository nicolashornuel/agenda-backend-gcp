package com.nho.model;

import java.util.Date;

public class TodoDTO {

	private String id;
	private boolean isResolved;
	private String description;
	private int priority;
	private Date creatingDate;
	private Date updatingDate;
	private String category;

	public TodoDTO() {
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

	public Date getCreatingDate() {
		return creatingDate;
	}

	public void setCreatingDate(Date creatingDate) {
		this.creatingDate = creatingDate;
	}

	public Date getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Date updatingDate) {
		this.updatingDate = updatingDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
