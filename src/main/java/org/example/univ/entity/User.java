package org.example.univ.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;
    private String password;

    @PrimaryKeyJoinColumn
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Section section;
}
