package co.grandcircus.capstone6;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskForApiRepository extends JpaRepository<TaskForApi, Long> {
	List<TaskForApi> findByDescriptionContaining(String description);
}
