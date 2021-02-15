package br.com.everis.dione.api_delivery.repository;

import br.com.everis.dione.api_delivery.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

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
