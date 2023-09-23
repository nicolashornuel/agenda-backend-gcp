package com.nho.model;

import java.util.Objects;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;

@Document(collectionName = "user")
public class UserEntity {

	@DocumentId
	private String id;
	private String displayName;
	private String email;
	private String phoneNumber;
	private String photoURL;
	private String providerId;
	private String uid;

	public UserEntity() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(displayName, email, id, phoneNumber, photoURL, providerId, uid);
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
		UserEntity other = (UserEntity) obj;
		return Objects.equals(displayName, other.displayName) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(photoURL, other.photoURL)
				&& Objects.equals(providerId, other.providerId) && Objects.equals(uid, other.uid);
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", displayName=" + displayName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", photoURL=" + photoURL + ", providerId="
				+ providerId + ", uid=" + uid + "]";
	}

}
