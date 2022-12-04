package io.sangamo.Promo.model;

import io.sangamo.Promo.constants.PartyType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Party extends GenericEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PartyType partyType;

    @ManyToMany(mappedBy = "party_promo_id")
    Set<PromoCode> promo_code;
}
