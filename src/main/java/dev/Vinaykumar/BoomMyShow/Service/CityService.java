package dev.Vinaykumar.BoomMyShow.Service;
import dev.Vinaykumar.BoomMyShow.Model.City;
import dev.Vinaykumar.BoomMyShow.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public City getCityByName(String cityName){
        City city = cityRepository.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get();
    }

    public City saveCity(String cityName){
        City city = new City();
        city.setCityName(cityName);
        return cityRepository.save(city);
    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return true;
    }
}