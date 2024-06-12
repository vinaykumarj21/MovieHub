package dev.Vinaykumar.MovieHub.Model;

import dev.Vinaykumar.MovieHub.Model.Enums.SeatStatus;
import dev.Vinaykumar.MovieHub.Model.Enums.SeatType;
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
    public Seat() {
    }

    public Seat(int row, int col, String seatNumber, SeatType seatType, SeatStatus status) {
        this.row = row;
        this.col = col;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = status;
    }

    @Column(name = "Seat_row")
    private int row;
    @Column(name = "Seat_col")
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
