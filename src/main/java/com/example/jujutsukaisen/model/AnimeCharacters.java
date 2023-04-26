package com.example.jujutsukaisen.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Entity
@Table(name = "characters")
public class AnimeCharacters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @JoinColumn(name="specie", insertable = false, updatable=false)
    @ManyToOne(cascade = {CascadeType.ALL})
    private Species specie;

    @Column(name="name")
    private String name;

    @Column(name="birthday")
    private String birthday;

    @Column(name="gender")
    private String gender;

    @Column(name="status")
    private String status;


    @JoinColumn(name = "occupation", insertable=false, updatable=false)
    @ManyToOne(cascade = {CascadeType.ALL})
    private Occupation occupation;

    @Column(name="grade")
    private String grade;

    @ManyToMany(mappedBy = "characters")
    @JsonBackReference
    private List<Episode> episodeList;
}
