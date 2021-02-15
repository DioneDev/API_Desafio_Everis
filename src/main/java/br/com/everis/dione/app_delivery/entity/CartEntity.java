package br.com.everis.dione.app_delivery.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Cart")
public class CartEntity {

    // Cliente usando o carrinho para colocar os produtos e escolhendo as formas de pagamento.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne // Um carrinho possui um cliente.
    private ClientEntity clientEntity;
    @OneToMany // Um carrinho possui varios produtos.
    @JoinColumn(name = "product_id")
    private List<ProductEntity> productsEntity; // Pega minha lista de produtos.
    @Enumerated(EnumType.STRING)
    private Payment payment; // Este pagamento é do tipo enum e será salvo no banco com string.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public List<ProductEntity> getProductsEntity() {
        return productsEntity;
    }

    public void setProductsEntity(List<ProductEntity> productsEntity) {
        this.productsEntity = productsEntity;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
