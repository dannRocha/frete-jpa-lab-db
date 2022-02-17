package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "frete")
@Getter
@Setter
public class Frete {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String codigo;
  private BigDecimal valor;
  @Column(name = "numero_nota_fiscal")
  private String numeroNotaFiscal;

  @ManyToOne
  private Cliente cliente;

  @ManyToOne
  @JoinColumn(name = "cidade_de_origem_id")
  private Cidade cidadeDeOrigem;

  @ManyToOne
  @JoinColumn(name = "cidade_de_destino_id")
  private Cidade cidadeDeDestino;

  @ManyToOne
  private CatetegoriaFrete categoria;

  @OneToMany(mappedBy = "frete")
  private Set<ItemFrete> itensFrete;

  @Embedded
  private Parametro parametro;

  @ManyToOne
  private Veiculo veiculo;
}
