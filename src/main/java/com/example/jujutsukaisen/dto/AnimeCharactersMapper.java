package com.example.jujutsukaisen.dto;

import com.example.jujutsukaisen.model.AnimeCharacters;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;


@Mapper(componentModel = "spring")
public interface AnimeCharactersMapper {

    @Mapping(target = "specieType",source = "specie.type")
    @Mapping(target = "occupation",source = "occupation.type")
    AnimeCharactersDto toDto(AnimeCharacters animeCharacters);

    @Mapping(target = "specieType",source = "specie.type")
    @Mapping(target = "occupation",source = "occupation.type")
    List<AnimeCharactersDto> toDtos(List<AnimeCharacters> characters);

    @InheritInverseConfiguration(name = "toDto")
    AnimeCharacters fromDto(AnimeCharactersDto dto);

}
