package org.example.tpjaxrs.repo;

import org.example.tpjaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CompteRepository extends JpaRepository<Compte ,Long> {
}
