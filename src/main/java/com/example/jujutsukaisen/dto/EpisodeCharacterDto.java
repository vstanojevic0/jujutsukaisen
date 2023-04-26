package com.example.jujutsukaisen.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Data
@Getter
@Setter
@ToString
public class EpisodeCharacterDto {

    private String name;
    private String description;
    private List<String> characterName;

}
