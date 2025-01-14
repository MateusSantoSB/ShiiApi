package com.ShiiSecret.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ShiiSecret.models.Secrets;

public interface SecretRepository extends JpaRepository<Secrets, Long> {

	@Query(value="SELECT * FROM secrets ORDER BY RANDOM() limit 1", nativeQuery = true)
	Secrets findRandomSecret();

}
