package com.example.jujutsukaisen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class EpisodeDto {

    private Integer id;
    private String name;
    private  String description;

}
