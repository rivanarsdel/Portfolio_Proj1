package dev.riv.trms.application.repositories;

import dev.riv.trms.models_dtos.TrForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrFormRepo extends JpaRepository<TrForm, Integer> {
}
