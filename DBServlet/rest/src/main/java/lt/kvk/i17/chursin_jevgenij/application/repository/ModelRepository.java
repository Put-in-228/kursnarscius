package lt.kvk.i17.chursin_jevgenij.application.repository;

import lt.kvk.i17.chursin_jevgenij.application.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModelRepository extends JpaRepository<Model, Integer> {
}
