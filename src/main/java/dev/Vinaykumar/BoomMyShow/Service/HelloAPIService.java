package dev.Vinaykumar.BoomMyShow.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloAPIService {
    public String greet(){
        return "HELLO";
    }
}
