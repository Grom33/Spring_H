package ru.otus.gromov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.gromov.domain.Genre;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Long> {

    Optional<Genre> findByName(String name);

}
