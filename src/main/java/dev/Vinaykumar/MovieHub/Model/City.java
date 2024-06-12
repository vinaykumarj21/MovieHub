package dev.Vinaykumar.MovieHub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }
    private String cityName;
    @OneToMany
    private List<Theatre> theatres;

}
