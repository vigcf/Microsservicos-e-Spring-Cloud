package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entites.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long> {

}