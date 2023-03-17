package io.bootify.my_app.repos;

import io.bootify.my_app.domain.TransportoPriemone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransportoPriemoneRepository extends JpaRepository<TransportoPriemone, Integer> {
}
