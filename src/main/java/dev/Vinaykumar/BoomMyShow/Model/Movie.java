package dev.Vinaykumar.BoomMyShow.Model;

import dev.Vinaykumar.BoomMyShow.Model.Enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    private int duration;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
