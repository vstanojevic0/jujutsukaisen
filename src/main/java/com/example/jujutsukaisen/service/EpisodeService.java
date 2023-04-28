package com.example.jujutsukaisen.service;

import com.example.jujutsukaisen.dto.EpisodeCharacterDto;
import com.example.jujutsukaisen.model.AnimeCharacters;
import com.example.jujutsukaisen.model.Episode;
import com.example.jujutsukaisen.repository.EpisodeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;

    public List<EpisodeCharacterDto> allEpisodes(){

        List<EpisodeCharacterDto> list = new ArrayList<>();

        List<Episode> allepisodes = episodeRepository.findAll();

        for (Episode episode : allepisodes){

            EpisodeCharacterDto episodeCharacterDto = new EpisodeCharacterDto();
            episodeCharacterDto.setName(episode.getName());
            episodeCharacterDto.setDescription(episode.getDescription());
            episodeCharacterDto.setCharacterName(episode.getCharacters().stream().map(AnimeCharacters::getName).collect(Collectors.toList()));
            list.add(episodeCharacterDto);

        }
        return list;
    }
    public EpisodeCharacterDto episodeById(Integer id){

        Episode episode = episodeRepository.findById(id).orElse(null);
        EpisodeCharacterDto episodeCharacterDto = new EpisodeCharacterDto();
        episodeCharacterDto.setName(episode.getName());
        episodeCharacterDto.setDescription(episode.getDescription());

        List<String> characternames = new ArrayList<>();
        for(AnimeCharacters c : episode.getCharacters()){
            characternames.add(c.getName());
        }
        episodeCharacterDto.setCharacterName(characternames);

        return episodeCharacterDto;
    }
    public List<EpisodeCharacterDto> episodeByName(String name){

        List<EpisodeCharacterDto> list = new ArrayList<>();

        List<Episode> allepisodes = episodeRepository.findAllByName(name);

        for (Episode episode : allepisodes){

            EpisodeCharacterDto episodeCharacterDto = new EpisodeCharacterDto();
            episodeCharacterDto.setName(episode.getName());
            episodeCharacterDto.setDescription(episode.getDescription());
            episodeCharacterDto.setCharacterName(episode.getCharacters().stream().map(AnimeCharacters::getName).collect(Collectors.toList()));
            list.add(episodeCharacterDto);

        }
        return list;
    }


}
