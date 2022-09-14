package ApiRest.restapiMYSQL.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping(path = "/api/user/{code}")
    public ResponseEntity consult(@PathVariable("code") String code){
        return null;
    }
}
