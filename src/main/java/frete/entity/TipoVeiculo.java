package frete.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("generico")
@Getter
@Setter
public final class TipoVeiculo extends Veiculo {
  private String descricao;
  private Integer pesoMaximo;
}
