package pl.strefakursow.skBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.skBackend.entity.Operator;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator, Long> {

    public Optional<Operator> findByLogin(String login);
}
