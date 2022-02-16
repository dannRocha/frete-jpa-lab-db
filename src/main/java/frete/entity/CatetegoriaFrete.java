package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "catetegoria_frete")
@Getter
@Setter
public class CatetegoriaFrete {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private BigDecimal desconto;
  private Double percentual;

  @OneToMany(mappedBy = "categoria")
  private Set<Frete> fretes;

}