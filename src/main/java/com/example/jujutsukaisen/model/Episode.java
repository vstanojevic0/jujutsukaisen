package com.example.jujutsukaisen.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data
@Setter
@Getter
@ToString
@Entity
@Table(name ="episode")
public class Episode {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;


    @Column(name="name")
    private String name;

    @Column(name="description")
    private  String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinTable(name = "episodecharacter" , joinColumns = @JoinColumn(name = "episode_Id"), inverseJoinColumns = @JoinColumn(name = "character_Id"))
    private List<AnimeCharacters> characters;

}
