package dev.Vinaykumar.BoomMyShow.Model;

import dev.Vinaykumar.BoomMyShow.Model.Enums.SeatStatus;
import dev.Vinaykumar.BoomMyShow.Model.Enums.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @Column(name = "Seat_row")
    private int row;
    @Column(name = "Seat_col")
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
