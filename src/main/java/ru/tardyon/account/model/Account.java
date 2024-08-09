package ru.tardyon.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ACCOUNT")
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "ACCOUNT_SEQUENCE", sequenceName = "ACCOUNT_SEQUENCE", allocationSize = 1)
    @GeneratedValue(generator = "ACCOUNT_SEQUENCE", strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "BALANCE")
    private BigDecimal balance;
}
