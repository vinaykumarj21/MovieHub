package dev.Vinaykumar.BoomMyShow.Repository;

import dev.Vinaykumar.BoomMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
