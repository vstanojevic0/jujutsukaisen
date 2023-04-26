package com.example.jujutsukaisen.repository;

import com.example.jujutsukaisen.model.AnimeCharacters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnimeCharactersRepository extends JpaRepository<AnimeCharacters, Integer>{

    List<AnimeCharacters> findAllById(Integer id);

    @Query(value = "from AnimeCharacters where id in (:ids)")
    List<AnimeCharacters> findAllByIds(List<Integer> ids);

    @Query(value = "from AnimeCharacters where name like %:name%")
    List<AnimeCharacters> findAllByName(String name);

    @Override
    <S extends AnimeCharacters> S save(S entity);
}
