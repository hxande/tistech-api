package api.tistech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.tistech.models.LogModel;

@Repository
public interface LogModelRepository extends JpaRepository<LogModel, Long> {

}
