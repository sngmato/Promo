package io.sangamo.Promo.service.dataservice;

import io.sangamo.Promo.constants.PartyType;
import io.sangamo.Promo.dto.PartyRequestDTO;
import io.sangamo.Promo.model.Party;

public class PartyDS {
    public Party createPartyEntity(PartyRequestDTO requestDTO) {
        Party partyEntity = new Party();
        partyEntity.setName(requestDTO.getName());
        partyEntity.setPartyType(PartyType.valueOf(requestDTO.getPartyType()));

        return partyEntity;
    }
}
