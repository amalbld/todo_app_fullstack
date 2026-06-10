package com.gestiontaches.gestiontaches.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiontaches.gestiontaches.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
