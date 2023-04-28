package com.example.jujutsukaisen.controller;

import com.example.jujutsukaisen.dto.*;
import com.example.jujutsukaisen.repository.EpisodeRepository;
import com.example.jujutsukaisen.repository.AnimeCharactersRepository;
import com.example.jujutsukaisen.service.EpisodeService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@SecurityRequirement(name = "jujutsukaisen")
@Tag(name= "Jujutsu Kaisen API")
public class AuthenticationController  {
    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private AnimeCharactersRepository animeCharactersRepository;

    @Autowired
    private AnimeCharactersMapper animeCharactersMapper;

    @Autowired
    private EpisodeService episodeService;

    @Autowired
    private EpisodeMapper episodeMapper;


        @PostMapping("/login")
        public void login(@RequestParam String username, @RequestParam String password) {}


}
