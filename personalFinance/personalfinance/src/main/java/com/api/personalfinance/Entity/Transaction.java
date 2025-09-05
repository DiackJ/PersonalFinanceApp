package com.api.personalfinance.Entity;

import com.api.personalfinance.Enum.Category;
import com.api.personalfinance.Enum.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;
    private String recipientOrSender;
    private Category category;
    private LocalDateTime transactionDate;
    private int amount;
    private TransactionType type;
}
