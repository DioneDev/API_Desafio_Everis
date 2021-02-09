package br.com.everis.dione.app_delivery.controller;

import br.com.everis.dione.app_delivery.client.ClientEntity;
import br.com.everis.dione.app_delivery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Responsavel por criar a estrutura MVC para trabalhar com API's.
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientRepository acoes;

    @RequestMapping(value="/client", method= RequestMethod.GET)
    public @ResponseBody List<ClientEntity> listar(){
        return acoes.findAll();
    }

    @RequestMapping(value="/client", method= RequestMethod.POST)
    public @ResponseBody ClientEntity cadastrar(@RequestBody ClientEntity client){
        return acoes.save(client);
    }


}
