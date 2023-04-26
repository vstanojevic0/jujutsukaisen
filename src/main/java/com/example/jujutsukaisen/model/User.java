package com.example.jujutsukaisen.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;


@Entity
@Data
@Setter
@Getter
@ToString
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne
    @JoinColumn(name = "role")
    private  Role role;


}
