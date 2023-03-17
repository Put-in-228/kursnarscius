package lt.kvk.i17.chursin_jevgenij.application.repository;

import lt.kvk.i17.chursin_jevgenij.application.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
