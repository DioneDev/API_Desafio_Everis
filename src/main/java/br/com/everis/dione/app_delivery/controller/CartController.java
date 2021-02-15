package br.com.everis.dione.app_delivery.controller;

import br.com.everis.dione.app_delivery.entity.CartEntity;
import br.com.everis.dione.app_delivery.entity.ClientEntity;
import br.com.everis.dione.app_delivery.repository.CartRepository;
import br.com.everis.dione.app_delivery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository acoes;

    @RequestMapping(method= RequestMethod.GET)
    public List<CartEntity> listar(){

        return acoes.findAll();
    }

    @RequestMapping(method= RequestMethod.POST)
    public CartEntity cadastrar(@RequestBody CartEntity cart){ // @ResquestBody vai dizer para o meu backend que esta recebendo informações do frontend.
        return acoes.save(cart);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> atualizar(@RequestBody CartEntity cart){
        Optional<CartEntity> carrinhoVerificado = acoes.findById(cart.getId());
        if(carrinhoVerificado.isPresent()){
            acoes.save(cart);
            return ResponseEntity.ok(cart);
        }
        return ResponseEntity.ok("Houve um problema ao atualizar!");
    }
    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<String> deletar(@PathVariable int id){
        acoes.deleteById(id);
        return ResponseEntity.ok("Excluido com sucesso!");
    }



}
