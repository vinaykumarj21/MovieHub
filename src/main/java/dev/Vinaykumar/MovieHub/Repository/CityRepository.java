package dev.Vinaykumar.MovieHub.Repository;

import dev.Vinaykumar.MovieHub.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    City findCityByName(String name);
}
