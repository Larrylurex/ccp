package com.dmitry.borodin.ccp.repository;

import com.dmitry.borodin.ccp.entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CapturePointRepository extends JpaRepository<Interaction, Integer> {
}
