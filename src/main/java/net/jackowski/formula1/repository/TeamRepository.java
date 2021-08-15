package net.jackowski.formula1.repository;

import net.jackowski.formula1.model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends PagingAndSortingRepository<Team, Integer> {
}
