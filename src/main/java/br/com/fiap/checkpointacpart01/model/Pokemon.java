package br.com.fiap.checkpointacpart01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    private Long id;
    @Column(name = "nome_pokemon", length = 24,
            columnDefinition = "char(24)", nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    private String tipoSecundario;

    @Column(nullable = false)
    private String descricao;
}
