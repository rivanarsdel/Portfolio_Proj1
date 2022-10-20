package dev.riv.trms.application.repositories;

import dev.riv.trms.models_dtos.EmpMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMessageRepo extends JpaRepository<EmpMessage, Integer> {
}
