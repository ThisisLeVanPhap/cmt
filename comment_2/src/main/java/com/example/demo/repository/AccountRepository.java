package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
	Optional<AccountEntity> findById(int id);
}