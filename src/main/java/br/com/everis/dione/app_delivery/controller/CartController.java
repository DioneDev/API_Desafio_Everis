package br.com.everis.dione.app_delivery.controller;

import br.com.everis.dione.app_delivery.entity.CartEntity;
import br.com.everis.dione.app_delivery.entity.ClientEntity;
import br.com.everis.dione.app_delivery.repository.CartRepository;
import br.com.everis.dione.app_delivery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository acoes;

    @RequestMapping (method= RequestMethod.GET)
    public List<CartEntity> listar(){

        return acoes.findAll();
    }

    @RequestMapping (method= RequestMethod.POST)
    public CartEntity cadastrar(@RequestBody CartEntity cart){ // @ResquestBody vai dizer para o meu backend que esta recebendo informações do frontend.
        return acoes.save(cart);
    }

}
