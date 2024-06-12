package dev.Vinaykumar.MovieHub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends BaseModel{

    public Theatre() {
    }

    public Theatre(String theatreName, String theatreAddress) {
        this.theatreName = theatreName;
        this.theatreAddress = theatreAddress;
    }
    private String theatreName;
    private String theatreAddress;
    @OneToMany
    private List<Auditorium> auditoriums;

}
