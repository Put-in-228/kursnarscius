package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModelRepository extends JpaRepository<Model, Integer> {
}
