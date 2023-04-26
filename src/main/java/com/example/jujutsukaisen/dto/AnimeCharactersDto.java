package com.example.jujutsukaisen.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AnimeCharactersDto {
//validacije
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;//dozvoli bazi ?
    private String name;
    private String birthday;
    private String gender;//enum
    private String status;//emum?
    private String occupation;
    private String grade;
    private String specieType;


}
