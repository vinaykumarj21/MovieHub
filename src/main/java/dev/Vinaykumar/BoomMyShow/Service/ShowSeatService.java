package dev.Vinaykumar.BoomMyShow.Service;
import dev.Vinaykumar.BoomMyShow.Model.ShowSeat;
import dev.Vinaykumar.BoomMyShow.Repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId){
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat seat){
        return showSeatRepository.save(seat); // save() -> upsert, means insert and update both
    }
}