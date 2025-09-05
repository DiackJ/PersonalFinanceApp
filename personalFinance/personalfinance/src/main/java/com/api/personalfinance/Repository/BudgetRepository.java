package com.api.personalfinance.Repository;

import com.api.personalfinance.Entity.Budget;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long>{
}
