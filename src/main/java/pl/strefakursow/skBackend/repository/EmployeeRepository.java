package pl.strefakursow.skBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.skBackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
