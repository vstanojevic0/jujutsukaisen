package com.example.jujutsukaisen.dto;

import com.example.jujutsukaisen.model.Episode;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EpisodeMapper {

    EpisodeDto toDto(Episode episode);

    @InheritInverseConfiguration(name = "toDto")
    Episode fromDto(EpisodeDto episodeDto);
}
