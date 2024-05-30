package dev.Vinaykumar.BoomMyShow.Model;

import dev.Vinaykumar.BoomMyShow.Model.Enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    private LocalDateTime bookingTime;
    private double totalAmount;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
