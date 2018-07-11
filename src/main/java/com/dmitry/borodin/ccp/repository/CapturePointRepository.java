package com.dmitry.borodin.ccp.repository;

import com.dmitry.borodin.ccp.entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapturePointRepository extends JpaRepository<Interaction, Integer> {
}
