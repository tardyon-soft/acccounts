package ru.tardyon.account.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "PHONE_DATA")
@AllArgsConstructor
@NoArgsConstructor
public class PhoneData implements Serializable {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "PHONE_DATA_SEQUENCE", sequenceName = "PHONE_DATA_SEQUENCE", allocationSize = 1)
    @GeneratedValue(generator = "PHONE_DATA_SEQUENCE", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "PHONE")
    private String phone;
}
