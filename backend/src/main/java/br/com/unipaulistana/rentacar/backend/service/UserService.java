package br.com.unipaulistana.rentacar.backend.service;

import br.com.unipaulistana.rentacar.backend.datasource.repository.UserRepository;
import br.com.unipaulistana.rentacar.backend.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAllUsers(){
        return this.userRepository.findAll();
    }

    public Optional<User> findById(final Long id){
        if( id == null)
            return Optional.empty();
        return this.userRepository.findById(id);
    }

    public User save (User user){
        if(user == null)
            return null;

        this.userRepository.save(user);
        return user;
    }
}
