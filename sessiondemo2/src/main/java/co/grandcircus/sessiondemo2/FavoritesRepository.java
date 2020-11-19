package co.grandcircus.sessiondemo2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritesRepository extends JpaRepository<Favorites, Long> {
	List<Favorites> findByUsername(String username);
}
