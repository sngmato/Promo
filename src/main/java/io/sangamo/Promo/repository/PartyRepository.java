package io.sangamo.Promo.repository;

import io.sangamo.Promo.model.Party;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PartyRepository extends JpaRepository<Party, BigInteger> {
}
