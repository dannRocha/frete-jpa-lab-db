package frete.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "cidade")
@Getter
@Setter
public class Cidade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String estado;


  @OneToMany(mappedBy = "cidadeDeOrigem")
  private Set<Frete> fretesSaida;

  @OneToMany(mappedBy = "cidadeDeDestino")
  private Set<Frete> fretesEntrada;


  @Embedded
  private DIstancia dIstancia;
}
