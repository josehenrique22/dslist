package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDTO.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositories gameRepositories;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositories.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
