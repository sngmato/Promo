package io.sangamo.Promo.controller;

import io.sangamo.Promo.dto.PartyRequestDTO;
import io.sangamo.Promo.dto.PartyResponseDTO;
import io.sangamo.Promo.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PartyController {

    private final PartyService partyService;

    @PostMapping("/api/onboard")
    @ResponseStatus(HttpStatus.CREATED)
    PartyResponseDTO createParty(@RequestBody PartyRequestDTO requestDTO){
        return partyService.createParty(requestDTO);
    }
}
