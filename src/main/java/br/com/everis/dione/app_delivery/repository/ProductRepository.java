package br.com.everis.dione.app_delivery.repository;

import br.com.everis.dione.app_delivery.entity.ClientEntity;
import br.com.everis.dione.app_delivery.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

//    // Listar
//    List<ProductEntity> findAll();
//
//    // Pesquisar
//    ProductEntity findById(int id);
//
//    // Remover
//    void delete(ProductEntity product);
//
//    // Cadastrar / Alterar
//    <ProductModel extends ProductEntity> ProductModel save(ProductModel product);
}
