package com.nb.uolhostbackend.service;

import com.nb.uolhostbackend.infra.CodinameHandler;
import com.nb.uolhostbackend.model.GroupType;
import com.nb.uolhostbackend.model.Player;
import com.nb.uolhostbackend.model.dtos.PlayerDto;
import com.nb.uolhostbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private CodinameHandler codinameHandler;

    public Player createPlayer(PlayerDto dto){
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return playerRepository.save(newPlayer);
    }

    public String getCodiname(GroupType groupType){
        return codinameHandler.findCodiname(groupType);
    }

}
