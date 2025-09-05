package com.api.personalfinance.Repository;

import com.api.personalfinance.Entity.Bill;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
