package com.nb.uolhostbackend.service;

import com.nb.uolhostbackend.model.Player;
import com.nb.uolhostbackend.model.dtos.PlayerDto;
import com.nb.uolhostbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(PlayerDto dto){
        Player newPlayer = new Player(dto);
        return playerRepository.save(newPlayer);
    }
}
