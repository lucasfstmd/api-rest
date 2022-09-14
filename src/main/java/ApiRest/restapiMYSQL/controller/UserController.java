package ApiRest.restapiMYSQL.controller;


import ApiRest.restapiMYSQL.model.UserModel;
import ApiRest.restapiMYSQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    /*
    Consult user in data Base
     */
    @GetMapping(path = "/api/user/{Id}")
    public ResponseEntity consult(@PathVariable("Id") int Id){
        return repository.findById(Id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public UserModel save(@RequestBody UserModel user){
        return repository.save(user);
    }

}
