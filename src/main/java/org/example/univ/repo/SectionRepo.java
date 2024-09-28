package org.example.univ.repo;

import org.example.univ.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SectionRepo extends JpaRepository<Section, Integer> {
    Optional<Section> findByNumber(int number);
}
