package dev.Vinaykumar.BoomMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends BaseModel{

    private String theatreName;
    private String theatreAddress;
    @OneToMany
    private List<Auditorium> auditoriums;

}
