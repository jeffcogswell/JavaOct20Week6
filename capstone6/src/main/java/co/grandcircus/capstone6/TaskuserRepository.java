package co.grandcircus.capstone6;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskuserRepository extends JpaRepository<Taskuser, Long> {
	public Taskuser findByEmail(String email);
}
