package dev.Vinaykumar.MovieHub.Repository;

import dev.Vinaykumar.MovieHub.Model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
    Theatre findTheatreByName(String theatreName);
}
