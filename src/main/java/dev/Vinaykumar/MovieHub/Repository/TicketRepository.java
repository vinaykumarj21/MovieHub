package dev.Vinaykumar.MovieHub.Repository;

import dev.Vinaykumar.MovieHub.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
