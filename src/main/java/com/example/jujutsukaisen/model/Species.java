package com.example.jujutsukaisen.model;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@ToString
@Entity
@Table (name = "species")
public class Species {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Integer id;

        @Column (name ="type")
        private String type;


}
