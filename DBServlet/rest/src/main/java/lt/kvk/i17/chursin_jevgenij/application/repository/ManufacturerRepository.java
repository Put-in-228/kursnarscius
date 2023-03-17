package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
