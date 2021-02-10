package br.com.everis.dione.app_delivery.controller;

import br.com.everis.dione.app_delivery.entity.ClientEntity;
import br.com.everis.dione.app_delivery.entity.ProductEntity;
import br.com.everis.dione.app_delivery.repository.ClientRepository;
import br.com.everis.dione.app_delivery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Responsavel por criar a estrutura MVC para trabalhar com API's.
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository acoes;

    @RequestMapping(method= RequestMethod.GET)
    public List<ProductEntity> listar(){
        return acoes.findAll();
    }

    @RequestMapping (method= RequestMethod.POST)
    public ProductEntity cadastrar(@RequestBody ProductEntity product ){ // @ResquestBody vai dizer para o meu backend que esta recebendo informações do frontend.
        return acoes.save(product);
    }
}
