package com.example.jujutsukaisen.controller;

import com.example.jujutsukaisen.dto.EpisodeCharacterDto;
import com.example.jujutsukaisen.dto.EpisodeDto;
import com.example.jujutsukaisen.dto.EpisodeMapper;
import com.example.jujutsukaisen.model.Episode;
import com.example.jujutsukaisen.repository.EpisodeRepository;
import com.example.jujutsukaisen.service.EpisodeService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@SecurityRequirement(name = "jujutsukaisen")
@Tag(name ="Episode Controller")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @Autowired
    private EpisodeMapper episodeMapper;

    @Autowired
    private EpisodeRepository episodeRepository;


    @GetMapping(value = "/episodes")
    public List<EpisodeCharacterDto> getall(){
        return episodeService.allEpisodes();
    }

    @GetMapping(value = "/episode/{id}")
    public EpisodeCharacterDto getEpisodeByid(@PathVariable Integer id){
        return  episodeService.episodeById(id);
    }


    @GetMapping(value =  "/episodeName/{name}")
    public List<EpisodeCharacterDto> episodeNames(@PathVariable String name){
        return episodeService.episodeByName(name);
    }

    //Create new episode
    @PostMapping(value = "/newepisode")
    public Episode createNewEpisode(@RequestBody EpisodeDto episode){
        Episode episode1 = episodeMapper.fromDto(episode);
        return episodeRepository.save(episode1);
    }

    @DeleteMapping(value = "/deleteEpisode/{id}")
    public void deleteEpisode(@PathVariable Integer id){
        episodeRepository.deleteById(id);
    }
}
