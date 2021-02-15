package br.com.everis.dione.api_delivery.repository;

import br.com.everis.dione.api_delivery.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
