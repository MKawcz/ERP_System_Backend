package pl.strefakursow.skBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.skBackend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
