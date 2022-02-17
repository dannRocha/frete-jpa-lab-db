package frete.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Parametro {
    @Column(name = "valor_km_rodado")
    private Integer valorKmRodado;
}
