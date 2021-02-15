package br.com.everis.dione.api_delivery.controller;

import br.com.everis.dione.api_delivery.entity.ClientEntity;
import br.com.everis.dione.api_delivery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Responsavel por criar a estrutura MVC para trabalhar com API's.
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository acoes;

    // Listar
    @RequestMapping (method= RequestMethod.GET)
    public List<ClientEntity> listar(){
        return acoes.findAll();
    }

    // Cadastrar
    @RequestMapping (method= RequestMethod.POST)
    public ClientEntity cadastrar(@RequestBody ClientEntity client){ // @ResquestBody vai dizer para o meu backend que esta recebendo informações do frontend.
        return acoes.save(client);
    }

    // Pesquisar por Id
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> pesquisarPorId(@PathVariable int id){
        Optional<ClientEntity> client = acoes.findById(id);
        if(client.isPresent()){
            return ResponseEntity.ok(client.get());
        }
        return ResponseEntity.ok("Id do cliente não encontrado");
    }

    // Atualizar
    @RequestMapping(method= RequestMethod.PUT)
    public ResponseEntity<?> atualizar(@RequestBody ClientEntity client){
        Optional<ClientEntity> clienteVerificado = acoes.findById(client.getId());
        if(clienteVerificado.isPresent()){
             acoes.save(client);
             return ResponseEntity.ok(client);
        }
        return ResponseEntity.ok("Houve um problema ao atualizar!");
    }

    // Deletar
    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<String> deletar(@PathVariable int id){
         acoes.deleteById(id);
         return ResponseEntity.ok("Excluido com sucesso!");
    }

}
