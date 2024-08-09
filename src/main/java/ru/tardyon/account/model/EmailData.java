package ru.tardyon.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "EMAIL_DATA")
@AllArgsConstructor
@NoArgsConstructor
public class EmailData implements Serializable {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "EMAIL_DATA_SEQUENCE", sequenceName = "EMAIL_DATA_SEQUENCE", allocationSize = 1)
    @GeneratedValue(generator = "EMAIL_DATA_SEQUENCE", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "EMAIL")
    private String email;
}
