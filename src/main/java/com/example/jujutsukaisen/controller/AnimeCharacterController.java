package com.example.jujutsukaisen.controller;

import com.example.jujutsukaisen.dto.AnimeCharactersDto;
import com.example.jujutsukaisen.dto.AnimeCharactersMapper;
import com.example.jujutsukaisen.model.AnimeCharacters;
import com.example.jujutsukaisen.repository.AnimeCharactersRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SecurityRequirement(name = "jujutsukaisen")
@Tag(name = "Anime Characters Controller")
public class AnimeCharacterController {

    //paginacija

    @Autowired
    private AnimeCharactersRepository animeCharactersRepository;

    @Autowired
    private AnimeCharactersMapper animeCharactersMapper;


    //Get all character
    @RequestMapping(value = "/allCharacters", method = RequestMethod.GET)
    public List<AnimeCharactersDto> getModel(@RequestParam(required = false) String gender){
        return animeCharactersMapper.toDtos(animeCharactersRepository.findAll());
    }

    //Get multiple characters by id
    @RequestMapping(value = "/characters/{ids}", method = RequestMethod.GET)
    public List<AnimeCharactersDto> getCharatersByIds(@PathVariable List<Integer> ids){
        return animeCharactersMapper.toDtos(animeCharactersRepository.findAllByIds(ids));
    }

    //Get character by id
    @RequestMapping(value = "/character/{id}" , method = RequestMethod.GET)
    public AnimeCharactersDto getCharaterById(@PathVariable Integer id){
        return animeCharactersMapper.toDto(animeCharactersRepository.getById(id));
    }

    @GetMapping(value = "/characterName/{name}")
    public List<AnimeCharactersDto> getCharacterByName(@PathVariable String name){
        return animeCharactersMapper.toDtos(animeCharactersRepository.findAllByName(name));
    }

    @PostMapping(value = "/newCharacter", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public AnimeCharacters createNewAnimeCharaters(@RequestBody AnimeCharactersDto animeCharacters){

        AnimeCharacters animeCharacters1 = animeCharactersMapper.fromDto(animeCharacters);
        return animeCharactersRepository.save(animeCharacters1);
    }

    @DeleteMapping(value = "/deleteCharacter/{id}")
    public void deleteCharacter(@PathVariable Integer id){
         animeCharactersRepository.deleteById(id);
    }

}
