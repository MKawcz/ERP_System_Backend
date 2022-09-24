package pl.strefakursow.skBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.skBackend.entity.QuantityType;

public interface QuantityTypeRepository extends JpaRepository<QuantityType, Long> {
}
