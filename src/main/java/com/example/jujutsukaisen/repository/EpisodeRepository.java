package com.example.jujutsukaisen.repository;

import com.example.jujutsukaisen.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode , Integer> {

    @Query(value = "from Episode where name like %:name%")
    List<Episode> findAllByName(String name);

    @Query(value = "from Episode where id in (:id)")
    List<Episode> findAllByIds(List<Integer> id);

}
