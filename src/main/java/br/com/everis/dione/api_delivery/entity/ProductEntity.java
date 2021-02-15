package br.com.everis.dione.api_delivery.entity;

import javax.persistence.*;

@Entity // Essa classe é uma tabela.
@Table(name = "Product") //Renomeia o nome da tabela.
public class ProductEntity {

    @Id // Indentidade da minha tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para gerar o id automaticamente.
    private int id;
    private String description;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

