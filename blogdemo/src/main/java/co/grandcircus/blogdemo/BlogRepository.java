package co.grandcircus.blogdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
	List<Blog> findByOrderByEntrydate(); // Example
	
	List<Blog> findTop10ByOrderByEntrydateDesc();
}
