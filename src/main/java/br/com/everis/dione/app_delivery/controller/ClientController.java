package br.com.everis.dione.app_delivery.controller;

import br.com.everis.dione.app_delivery.entity.ClientEntity;
import br.com.everis.dione.app_delivery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Responsavel por criar a estrutura MVC para trabalhar com API's.
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository acoes;

    @RequestMapping (method= RequestMethod.GET)
    public List<ClientEntity> listar(){
        return acoes.findAll();
    }

    @RequestMapping (method= RequestMethod.POST)
    public ClientEntity cadastrar(@RequestBody ClientEntity client){ // @ResquestBody vai dizer para o meu backend que esta recebendo informações do frontend.
        return acoes.save(client);
    }


}
