package com.api.personalfinance.Entity;

import com.api.personalfinance.Enum.Category;
import com.api.personalfinance.Enum.TransactionType;
import jakarta.persistence.*;

import java.util.Date;
import lombok.Data;


@Entity
@Data public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    @JoinColumn(name="user_id")
    private User user;
    private TransactionType transactionType;
    private Category category;
    private Date dueDate;
    private int amount;
    @Transient
    private int total;
}
