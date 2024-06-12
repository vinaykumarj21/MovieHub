package dev.Vinaykumar.BoomMyShow.Repository;

import dev.Vinaykumar.BoomMyShow.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    City findCityByName(String name);
}
