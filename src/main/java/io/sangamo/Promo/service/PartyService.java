package io.sangamo.Promo.service;

import io.sangamo.Promo.converter.PartyConverter;
import io.sangamo.Promo.dto.PartyRequestDTO;
import io.sangamo.Promo.dto.PartyResponseDTO;
import io.sangamo.Promo.model.Party;
import io.sangamo.Promo.repository.PartyRepository;
import io.sangamo.Promo.service.dataservice.PartyDS;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PartyService {
    private final PartyRepository partyRepository;
    private final PartyConverter partyConverter;

    private final PartyDS partyDS;

    public PartyResponseDTO createParty(PartyRequestDTO requestDTO){
        Party partyEntity = partyDS.createPartyEntity(requestDTO);
        Party party = partyRepository.save(partyEntity);
        return partyConverter.convertPartyEntityToResponse(party);
    }
}
