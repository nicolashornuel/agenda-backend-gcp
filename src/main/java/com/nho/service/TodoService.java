package com.nho.service;

import java.util.Date;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentChange;
import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.QuerySnapshot;
import com.nho.model.TodoDTO;
import com.nho.model.TodoEntity;

@Service
public class TodoService implements Mapper<TodoEntity, TodoDTO> {

	// @Autowired
	private Firestore firestore;

	private final CollectionReference collectionRef;

	public TodoService(Firestore firestore) {
		this.firestore = firestore;
		this.collectionRef = this.firestore.collection("todoList");
	}

	public void getAll() throws InterruptedException, ExecutionException {
		this.collectionRef.addSnapshotListener(new EventListener<QuerySnapshot>() {
			@Override
			public void onEvent(QuerySnapshot snapshots, FirestoreException e) {
				if (e != null) {
					System.err.println("Listen failed: " + e);
					return;
				}

				for (DocumentChange dc : snapshots.getDocumentChanges()) {
					switch (dc.getType()) {
					case ADDED:
						System.out.println("New city: " + dc.getDocument().getData());
						break;
					case MODIFIED:
						System.out.println("Modified city: " + dc.getDocument().getData());
						break;
					case REMOVED:
						System.out.println("Removed city: " + dc.getDocument().getData());
						break;
					default:
						break;
					}
				}
			}
		});

	}

	@Override
	public TodoDTO toDto(TodoEntity entity) {
		TodoDTO dto = new TodoDTO();
		dto.setId(entity.getId());
		dto.setResolved(entity.isResolved());
		dto.setDescription(entity.getDescription());
		dto.setPriority(entity.getPriority());
		dto.setCreatingDate(entity.getCreatingDate().toDate());
		if (entity.getUpdatingDate() != null) {
			dto.setUpdatingDate(entity.getUpdatingDate().toDate());
		}
		dto.setCategory(entity.getCategory());
		return dto;
	}

	@Override
	public TodoEntity toEntity(TodoDTO dto) {
		TodoEntity entity = new TodoEntity();
		if (dto.getId() != null) {
			entity.setId(dto.getId());
			entity.setUpdatingDate(Timestamp.of(new Date()));
		}
		entity.setResolved(dto.isResolved());
		entity.setDescription(dto.getDescription());
		entity.setPriority(dto.getPriority());
		entity.setCreatingDate(Timestamp.of(dto.getCreatingDate()));
		entity.setCategory(dto.getCategory());
		return entity;
	}
}
