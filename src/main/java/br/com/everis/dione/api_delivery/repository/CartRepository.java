package br.com.everis.dione.api_delivery.repository;

import br.com.everis.dione.api_delivery.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
}
