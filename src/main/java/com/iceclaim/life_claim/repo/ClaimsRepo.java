package com.iceclaim.life_claim.repo;

import com.iceclaim.life_claim.entities.Claims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimsRepo extends JpaRepository<Claims,Integer> {
}
