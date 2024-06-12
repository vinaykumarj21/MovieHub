package dev.Vinaykumar.MovieHub.Repository;

import dev.Vinaykumar.MovieHub.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findMovieByName(String movieName);
}
