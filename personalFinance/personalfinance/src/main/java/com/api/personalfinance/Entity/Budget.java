package com.api.personalfinance.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;
    private String categoryName;
    private int maxSpend;
    private int spent;
    private int remaining;
}
