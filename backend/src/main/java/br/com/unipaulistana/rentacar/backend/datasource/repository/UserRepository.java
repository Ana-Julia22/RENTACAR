package br.com.unipaulistana.rentacar.backend.datasource.repository;

import br.com.unipaulistana.rentacar.backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
