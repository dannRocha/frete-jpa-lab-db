package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "veiculo")
@Getter
@Setter
public class Veiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "numero_placa")
  private String numeroPlaca;

  @ManyToOne
  private Filial filial;

  @ManyToOne
  @JoinColumn(name = "tipo_veiculo")
  private TipoVeiculo tipoVeiculo;

  @OneToMany(mappedBy = "veiculo")
  private Set<Frete> fretes;
}
