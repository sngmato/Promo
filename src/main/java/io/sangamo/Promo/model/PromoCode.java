package io.sangamo.Promo.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.Set;

@Entity
public class PromoCode extends GenericEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger promo_id;
    private String promo_code;

    @ManyToMany
    @JoinTable(
            name = "party_promo",
            joinColumns = @JoinColumn(name = "promo_id"),
            inverseJoinColumns = @JoinColumn(name = "promo_id"))
    Set<Party> party_promo_id;
}
