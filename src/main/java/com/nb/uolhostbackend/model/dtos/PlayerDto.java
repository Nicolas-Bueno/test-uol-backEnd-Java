package com.nb.uolhostbackend.model.dtos;

import com.nb.uolhostbackend.model.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,

        GroupType groupType
) {
}
