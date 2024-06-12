package dev.Vinaykumar.BoomMyShow.Service;
import dev.Vinaykumar.BoomMyShow.Model.Enums.ShowSeatStatus;
import dev.Vinaykumar.BoomMyShow.Model.ShowSeat;
import dev.Vinaykumar.BoomMyShow.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private ShowSeatService showSeatService;

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {
        checkAndLockSeats(showSeatIds);
        startPayment(showSeatIds);
        return new Ticket();
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void checkAndLockSeats(List<Integer> showSeatIds) throws Exception {
        // checking if the selected seats are available
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new Exception("Seat is not available anymore");
            }
        }
        // updating the seats to a locked state
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }
    }

    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }
}
