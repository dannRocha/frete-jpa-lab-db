package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_frete")
@Getter
@Setter
public class ItemFrete {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;
  private Double peso;

  @ManyToOne
  private Frete frete;

}
