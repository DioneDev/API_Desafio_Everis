package br.com.everis.dione.app_delivery.entity;

import javax.persistence.*;

@Entity
@Table(name = "Client") //Renomeia o nome da tabela.
public class ClientEntity {

    @Id // Chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para gerar o id automaticamente.
    private int id;
    //@NotBlank => Não foi possivel colocar esta anotação para validar os campos.
    private String name;
    private String surname;
    private String cpf;
    private String telephone;
    private String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}