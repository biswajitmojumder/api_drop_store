package br.com.drop.controller;

import br.com.drop.model.entities.User;
import br.com.drop.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }


    @GetMapping("/all")
    public List<User> showAll(){
        return userRepository.findAll();
    }

}
