package com.nb.uolhostbackend.repository;

import com.nb.uolhostbackend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
