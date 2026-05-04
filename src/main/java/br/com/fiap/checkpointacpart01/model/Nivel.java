package br.com.fiap.checkpointacpart01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "niveis")
public class Nivel {
    @Id
    private Long id;
    @Column(name = "nivel_pokemon", nullable = false)
    private Integer nivel;

    @Column(nullable = false)
    private String nomeTreinador;

    @Column(nullable = false)
    private Integer estagio;

    @Column(nullable = false)
    private String ondeEncontrar;
}
