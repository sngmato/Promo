package io.sangamo.Promo.converter;

import io.sangamo.Promo.dto.PartyResponseDTO;
import io.sangamo.Promo.model.Party;

public class PartyConverter {

    public PartyResponseDTO convertPartyEntityToResponse(Party party) {
        return PartyResponseDTO.builder()
                .name(party.getName())
                .partyType(party.getPartyType().name())
                .build();
    }
}
