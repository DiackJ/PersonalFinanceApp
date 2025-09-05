package com.api.personalfinance.Repository;

import com.api.personalfinance.Entity.Pot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotRepository extends JpaRepository<Pot, Long> {
}
