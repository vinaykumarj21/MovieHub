package dev.Vinaykumar.MovieHub.Controller;

import dev.Vinaykumar.MovieHub.Service.HelloAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAPIController {

    @Autowired
    private HelloAPIService helloAPIService;

    @GetMapping("/hello")
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok(helloAPIService.greet());
    }
}
