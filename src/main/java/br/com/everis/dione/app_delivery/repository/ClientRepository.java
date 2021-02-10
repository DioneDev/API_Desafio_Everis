package br.com.everis.dione.app_delivery.repository;

import br.com.everis.dione.app_delivery.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

//    // Listar
//    List<ClientEntity> findAll();
//
//    // Pesquisar
//    ClientEntity findById(int id);
//
//    // Remover
//    void delete(ClientEntity client);
//
//    // Cadastrar / Alterar
//    <ClientMod extends ClientEntity> ClientMod save(ClientMod client);

}
