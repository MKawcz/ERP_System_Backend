package pl.strefakursow.skBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.skBackend.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
