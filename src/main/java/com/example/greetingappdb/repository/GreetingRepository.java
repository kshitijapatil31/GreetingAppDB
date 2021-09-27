package com.example.greetingappdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greetingappdb.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting ,Long>{

}
