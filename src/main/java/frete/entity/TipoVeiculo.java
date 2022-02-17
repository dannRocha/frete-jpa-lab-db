package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "tipo_veiculo")
@Getter
@Setter
public final class TipoVeiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String descricao;
  private Integer pesoMaximo;

  @OneToMany(mappedBy = "tipoVeiculo")
  private Set<Veiculo> veiculos;
}
