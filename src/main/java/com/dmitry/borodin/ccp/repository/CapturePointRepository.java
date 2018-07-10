package com.dmitry.borodin.ccp.repository;

import com.dmitry.borodin.ccp.entity.Interaction;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;

@Api("Interaction")
public interface CapturePointRepository extends JpaRepository<Interaction, Integer> {
}
