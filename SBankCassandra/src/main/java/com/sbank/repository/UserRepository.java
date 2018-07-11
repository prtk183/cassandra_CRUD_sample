package com.sbank.repository;

import java.util.Optional;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.sbank.model.Users;

public interface UserRepository extends CassandraRepository<Users, String> {

	@Query
	Optional<Users> findById(String id);




	}

