package com.marcogerstmann.mealy.orb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrbRepository extends JpaRepository<Orb, UUID> {
}
