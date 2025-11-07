package br.com.unipaulistana.rentacar.backend.presentation;

import br.com.unipaulistana.rentacar.backend.domain.User;
import br.com.unipaulistana.rentacar.backend.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostConstruct
    public void generateData(){
        System.out.println("Starting data generation");
        for(int i = 0; i < 100; i++){
            this.userService.save(User.builder()
                    .name("None " + i)
                    .email("Email@user.com" + 1)
                    .password("1234567678")
                    .build()
            );
        }
    }
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        return ResponseEntity.ok(this.userService.findAllUsers());

    }
}
