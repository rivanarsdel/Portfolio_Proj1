package dev.riv.trms.application.repositories;

import dev.riv.trms.models_dtos.TrEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrEventRepo extends JpaRepository<TrEvent, Integer> {
}
