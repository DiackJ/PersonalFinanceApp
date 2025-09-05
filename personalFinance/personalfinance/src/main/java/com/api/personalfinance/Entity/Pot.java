package com.api.personalfinance.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data public class Pot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;
    private String title;
    private int targetAmount;
    private int savedPercentage;
}
