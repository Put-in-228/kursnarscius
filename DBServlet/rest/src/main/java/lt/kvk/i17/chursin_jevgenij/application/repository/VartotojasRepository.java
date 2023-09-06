package lt.kvk.i17.chursin_jevgenij.application.repository;

import lt.kvk.i17.chursin_jevgenij.application.domain.Vartotojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VartotojasRepository extends JpaRepository<Vartotojas, Integer> {
    Vartotojas findByLogin(String login);
}
