package br.com.everis.dione.app_delivery.repository;

import br.com.everis.dione.app_delivery.entity.CartEntity;
import br.com.everis.dione.app_delivery.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
}
