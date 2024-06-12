package dev.Vinaykumar.BoomMyShow.Repository;

import dev.Vinaykumar.BoomMyShow.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findMovieByName(String movieName);
}
