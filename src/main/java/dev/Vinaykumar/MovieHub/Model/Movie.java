package dev.Vinaykumar.MovieHub.Model;

import dev.Vinaykumar.MovieHub.Model.Enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    public Movie() {
    }

    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    private int duration;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
