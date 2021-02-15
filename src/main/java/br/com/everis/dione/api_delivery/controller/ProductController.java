package br.com.everis.dione.api_delivery.controller;

import br.com.everis.dione.api_delivery.entity.ProductEntity;
import br.com.everis.dione.api_delivery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> atualizar(@RequestBody ProductEntity product){
        Optional<ProductEntity> ProdutoVerificado = acoes.findById(product.getId());
        if(ProdutoVerificado.isPresent()){
            acoes.save(product);
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.ok("Houve um problema ao atualizar o produto!");
    }

    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<String> deletar(@PathVariable int id){
        acoes.deleteById(id);
        return ResponseEntity.ok("Produto excluido com sucesso!");
    }
}
